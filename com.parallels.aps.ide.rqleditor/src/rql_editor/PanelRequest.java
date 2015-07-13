package rql_editor;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcHttpTransportException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import com.parallels.aps.ide.ui.preferences.PanelSettings;
import com.parallels.aps.ide.ui.preferences.SiteWithCredentials;

public class PanelRequest {
	// public PanelRequest() {
	// tokens = new HashMap<>();
	// }
	static {
		tokens = new HashMap<>();
	}

	public static String request(SiteWithCredentials controller, String request) {
		if (!tokens.containsKey(controller)) {
			tokens.put(controller, getToken(controller));
		}
		String token = tokens.get(controller);
		String response = sendRequest(controller.getAddress() + "?" + request,
				token);
		if (tokenIsExpired(response)) {
			tokens.put(controller, getToken(controller));
			token = tokens.get(controller);
			response = sendRequest(controller.getAddress(), token);
		}
		return response;
	}

	private static String getToken(SiteWithCredentials controller) {
		return null;
	}

	private static String sendRequest(String controllerURL, String apsToken) {
		return "";
	}

	private static boolean tokenIsExpired(String response) {
		return false;
	}

	private static HashMap<SiteWithCredentials, String> tokens;
	List<PanelSettings> mySettings = PanelSettings.loadSettings();

	public int provisionApplicationInstance(int subID, int appID,
			String resourceType, String endPoint, String packageVersion,
			List<PanelSettings> settings) throws CoreException {
		// Collect parameters
		HashMap<String, Object> params = new HashMap();
		params.put("subscription_id", subID);
		params.put("rt_id", new Integer(0)/* resourceType */);
		params.put("app_id", appID);
		params.put("url_path", endPoint);
		params.put("package_version", packageVersion);
		if (settings.size() > 0) {
			params.put("settings", settings);
		}
		// Send request
		Map result = executeRemoteMethod("pem.APS.provideApplicationInstance",
				new Object[] { params });
		if (result == null) {
			throw new CoreException(
					(IStatus) new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							"Unexpected error during provision. See POA log for more detail"));
		}
		// Get response
		int appInstanceId = (Integer) result.get("application_instance_id");
		return appInstanceId;
	}

	private Object getResult(Object response, String responsePart,
			Class classToken) {
		return classToken.cast(((Map) (response)).get(responsePart));
	}

	private Map executeRemoteMethod(String method, Object[] params) {
		String myErrorMessage = null;
		try {
			XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
			config.setBasicUserName(((PanelSettings) mySettings)
					.getXMLRPCSite().getLogin());
			config.setBasicPassword(((PanelSettings) mySettings)
					.getXMLRPCSite().getPassword());
			config.setServerURL(new URL(((PanelSettings) mySettings)
					.getXMLRPCSite().getAddress()));
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
					Integer obj = (Integer) getResult(response, "result",
							Integer.class);
					if (obj != null) {
						map = new HashMap();
						map.put("response", obj);
					} else {
						// try String
						String str = (String) getResult(response, "result",
								Integer.class);
						if (str != null) {
							map = new HashMap();
							map.put("response", str);
						}
					}
				}
				return map;
			}
			myErrorMessage = (String) getResult(response, "error_message",
					String.class);
		} catch (MalformedURLException e) {
		} catch (XmlRpcHttpTransportException e) {
			if ("HTTP server returned unexpected status: Unauthorized".equals(e
					.getMessage())) {
				Map map = new HashMap();
				map.put("status", "UNAUTHORIZED");
				return map;
			}
			myErrorMessage = e.getLocalizedMessage();
		} catch (XmlRpcException e) {
			myErrorMessage = e.getLocalizedMessage();
		}
		if (myErrorMessage != null) {
			myErrorMessage = myErrorMessage + " [" + method + "]";
		}
		return null;
	}
}
