package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.propertiesfile;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;



@Test
public class TC5 {
	
	public void testcasefive() throws IOException {
		Properties pr = propertiesfile.uploadpropertiesfile("../VG/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		System.out.println("*******************TC6********************");
		Response res = http.delete("QA_Env_videogames_URI", TC1.responseidValue);
		System.out.println("**********************TC5********************");
		System.out.println("Status code is " + res.statusCode());
		System.out.println("response data is "+res.asString());
		
	}

}
