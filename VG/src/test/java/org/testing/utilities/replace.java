package org.testing.utilities;

import java.util.regex.Pattern;

public class replace {
	public static String replacevalue(String data, String keyName, String keyValue) {
		
		data = data.replaceAll(Pattern.quote("{{"+keyName+"}}"), keyValue);
		
		return data;
	}

}
