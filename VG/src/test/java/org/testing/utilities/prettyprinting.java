package org.testing.utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class prettyprinting {
	public static String jsonPrettyPrinting(String jsonstring) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(jsonstring);
		return gson.toJson(je);
	}

}
