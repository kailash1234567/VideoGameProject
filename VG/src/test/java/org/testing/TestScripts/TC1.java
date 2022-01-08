package org.testing.TestScripts;




import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;

import org.testing.utilities.jsonfile;
import org.testing.utilities.jsonparsing;
import org.testing.utilities.prettyprinting;
import org.testing.utilities.propertiesfile;
import org.testing.utilities.randomdata;
import org.testing.utilities.replace;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;





@Test
public class TC1 {
	
	static String responseidValue;
	public void testcaseone() throws IOException {
		String bodydata = jsonfile.uploadjsonfile("../VG/src/test/java/org/testing/Payloads/bodydata.json");
		String randomid = randomdata.randomvalue();
	    bodydata = replace.replacevalue(bodydata, "id", randomid);
		Properties pr = propertiesfile.uploadpropertiesfile("../VG/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.post(bodydata, "QA_Env_videogames_URI");
		System.out.println("**********************TC1********************");
		
		System.out.println("Status code is " + res.statusCode());
		System.out.println("body data is "+ prettyprinting.jsonPrettyPrinting(bodydata));
		System.out.println("response data is "+res.asString());
		responseidValue = jsonparsing.jsonparse(bodydata, "id");

			
		
		
		
		
		
		
	}

}
