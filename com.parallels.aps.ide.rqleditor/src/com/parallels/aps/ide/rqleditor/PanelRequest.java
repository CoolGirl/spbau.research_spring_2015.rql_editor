package com.parallels.aps.ide.rqleditor;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcHttpTransportException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.parallels.aps.ide.ui.preferences.PanelSettings;
import com.parallels.aps.ide.ui.preferences.SiteWithCredentials;

public class PanelRequest {

	private static HashMap<SiteWithCredentials, ControllerTokenAndUri> ourControllerTokensAndUris;

	static {
		ourControllerTokensAndUris = new HashMap<>();
	}

	private static class ControllerTokenAndUri {
		String myApsToken;
		String myApsControllerURI;
	}

	// TODO: Deal with unathorized status in map and continue testing
	public static JsonNode request(SiteWithCredentials controllerXmlRpcSite, String request) {
		if (!ourControllerTokensAndUris.containsKey(controllerXmlRpcSite)) {
			ourControllerTokensAndUris.put(controllerXmlRpcSite, getTokenAndURI(controllerXmlRpcSite.getAddress()));
		}
		ControllerTokenAndUri tokenAndUri = ourControllerTokensAndUris.get(controllerXmlRpcSite);
		JsonNode response = sendRequest(tokenAndUri.myApsControllerURI + "aps/2/resources" + "?" + request,
				tokenAndUri.myApsToken);
		if (tokenIsExpired(response)) {
			ourControllerTokensAndUris.remove(controllerXmlRpcSite);
			request(controllerXmlRpcSite, request);
		}
		return response;
	}

	private static ControllerTokenAndUri getTokenAndURI(String controllerXmlRpcSiteAddress) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("subscription_id", 1);
		PanelSettings settings = getPanelSettingsByControllerAddress(controllerXmlRpcSiteAddress);
		@SuppressWarnings("unchecked")
		HashMap<String, Object> result = (HashMap<String, Object>) executeRemoteMethod("pem.APS.getSubscriptionToken",
				new Object[] { params }, settings);
		ControllerTokenAndUri controllerTokenAndURI = new ControllerTokenAndUri();
		controllerTokenAndURI.myApsToken = (String) result.get("aps_token");
		controllerTokenAndURI.myApsControllerURI = (String) result.get("controller_uri");
		return controllerTokenAndURI;
	}

	private static PanelSettings getPanelSettingsByControllerAddress(String controllerXmlRpcSiteAddress) {
		List<PanelSettings> ourSettings = PanelSettings.loadSettings();
		for (int i = 0; i < ourSettings.size(); i++) {
			if (ourSettings.get(i).getXMLRPCSite().getAddress().equals(controllerXmlRpcSiteAddress)) {
				return ourSettings.get(i);
			}
		}
		return null;
	}

	private static JsonNode sendRequest(String controllerURL, String apsToken) {
		HttpClient client = new HttpClient();
		GetMethod getMethod = new GetMethod(controllerURL);
		getMethod.addRequestHeader("APS-TOKEN", apsToken);
		JsonNode response = null;
		int statusCode = 0;
		try {
			statusCode = client.executeMethod(getMethod);
		} catch (HttpException e) {
			System.err.println(e.getLocalizedMessage());
		} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
		}
		if (statusCode == HttpStatus.SC_OK) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				response = mapper.readTree(getMethod.getResponseBodyAsStream());
			} catch (IOException e) {
				System.err.println(e.getLocalizedMessage());
			}
		}
		return response;
	}

	// 403 code, text about expiration
	private static boolean tokenIsExpired(JsonNode response) {
		String errorValue = response.path("error").textValue();
		String messageValue = response.path("message").textValue();
		return (new String("APS::Util::AuthenticationFailed").equals(errorValue) && new String("Authentication Failed")
				.equals(messageValue));
	}

	/*
	 * public static int provisionApplicationInstance(int subID, int appID,
	 * String resourceType, String endPoint, String packageVersion,
	 * List<PanelSettings> settings) throws CoreException { // Collect
	 * parameters HashMap<String, Object> params = new HashMap<String,
	 * Object>(); params.put("subscription_id", subID); params.put("rt_id", new
	 * Integer(0) //*resource type*); params.put("app_id", appID);
	 * params.put("url_path", endPoint); params.put("package_version",
	 * packageVersion); if (settings.size() > 0) { params.put("settings",
	 * settings); } // Send request
	 * 
	 * @SuppressWarnings("rawtypes") Map result =
	 * executeRemoteMethod("pem.APS.provideApplicationInstance", new Object[] {
	 * params }); if (result == null) { throw new CoreException( (IStatus) new
	 * Status(IStatus.ERROR, Activator.PLUGIN_ID,
	 * "Unexpected error during provision. See POA log for more detail")); } //
	 * Get response int appInstanceId = (Integer)
	 * result.get("application_instance_id"); return appInstanceId; }
	 */

	@SuppressWarnings("rawtypes")
	private static Object getResult(Object response, String responsePart, Class classToken) {
		return classToken.cast(((Map) (response)).get(responsePart));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	/**
		@return <code>null</code> if error is occurred, "status"->"UNAUTHORIZED" if unauthorized, 
		else the result of given method execution
	 */
	private static Map executeRemoteMethod(String method, Object[] params, PanelSettings settings) {
		String myErrorMessage = null;
		try {
			XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
			config.setBasicUserName(((PanelSettings) settings).getXMLRPCSite().getLogin());
			config.setBasicPassword(((PanelSettings) settings).getXMLRPCSite().getPassword());
			config.setServerURL(new URL(((PanelSettings) settings).getXMLRPCSite().getAddress()));
			config.setReplyTimeout(60 * 1000);
			XmlRpcClient client = new XmlRpcClient();
			client.setConfig(config);
			Object response = client.execute(method, params);
			Object status = getResult(response, "status", Integer.class);
			if (new Integer(0).equals(status)) {
				Map map = (Map) getResult(response, "result", HashMap.class);
				if (map == null) {
					// result is present but it is not a map
					// try Integer
					Integer obj = (Integer) getResult(response, "result", Integer.class);
					if (obj != null) {
						map = new HashMap();
						map.put("response", obj);
					} else {
						// try String
						String str = (String) getResult(response, "result", Integer.class);
						if (str != null) {
							map = new HashMap();
							map.put("response", str);
						}
					}
				}
				return map;
			}
			myErrorMessage = (String) getResult(response, "error_message", String.class);
		} catch (MalformedURLException e) {
		} catch (XmlRpcHttpTransportException e) {
			if ("HTTP server returned unexpected status: Unauthorized".equals(e.getMessage())) {
				Map map = new HashMap();
				map.put("status", "UNAUTHORIZED");
				return map;
			}
			myErrorMessage = e.getLocalizedMessage();
		} catch (XmlRpcException e) {
			myErrorMessage = e.getLocalizedMessage() + e.getCause();
		}
		if (myErrorMessage != null) {
			myErrorMessage = myErrorMessage + " [" + method + "]";
			System.err.println(myErrorMessage);
		}
		return null;
	}
}
