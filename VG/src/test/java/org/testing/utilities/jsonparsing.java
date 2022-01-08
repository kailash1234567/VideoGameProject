package org.testing.utilities;



import org.json.JSONArray;
import org.json.JSONObject;



public class jsonparsing {
	public static String jsonparse(String response, String keyname) {
		
		JSONObject jo = new JSONObject(response);
		
		return jo.get(keyname).toString();
		
	}
	public static String jsonallparse(String response, String keyname) {
		
		JSONArray js = new JSONArray(response);
		int L = js.length();
		String jp="";
		for(int i =0;i<L;i++) {
			
			JSONObject ob = js.getJSONObject(i);
			jp = jp+ob.get(keyname).toString();
		}
		return jp;
	}
	

}
