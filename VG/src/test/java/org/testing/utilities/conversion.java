package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class conversion {
	public static String xmltojson(String xmldata) {
		
		JSONObject js = XML.toJSONObject(xmldata);
		return js.toString();
	}
public static String jsontoxml(String jsondata) {
	
	JSONObject jo = new JSONObject(jsondata);
	String XML_Data = XML.toString(jo);
	return XML_Data;
}
}
