package rql_editor;

import java.util.HashMap;

import com.parallels.aps.ide.ui.preferences.SiteWithCredentials;

public class PanelRequest {
	
//	public PanelRequest() {
//		tokens = new HashMap<>();
//	}
	static {
		tokens = new HashMap<>();
	}
	
	public static String request(SiteWithCredentials controller, String request) {
		if (!tokens.containsKey(controller)) {
			tokens.put(controller, getToken(controller));
		}
		String token = tokens.get(controller);
		String response = sendRequest(controller.getAddress()+"?"+request, token);
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

}
