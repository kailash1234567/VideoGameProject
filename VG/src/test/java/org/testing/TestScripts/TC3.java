package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.conversion;
import org.testing.utilities.prettyprinting;
import org.testing.utilities.propertiesfile;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;





@Test
public class TC3 {
public void testcasethree() throws IOException {
		

	Properties pr = propertiesfile.uploadpropertiesfile("../VG/URI.properties");
	HTTPMethods http = new HTTPMethods(pr);
	Response res = http.getall("QA_Env_videogames_URI");
	System.out.println("**********************TC3********************");
	
	System.out.println("Status code is " + res.statusCode());
	System.out.println("response data is "+prettyprinting.jsonPrettyPrinting(conversion.xmltojson(res.asString())));
		
	}

}
