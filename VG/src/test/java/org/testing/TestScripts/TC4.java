package org.testing.TestScripts;




import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.conversion;
import org.testing.utilities.jsonfile;
import org.testing.utilities.prettyprinting;
import org.testing.utilities.propertiesfile;
import org.testing.utilities.replace;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;






@Test
public class TC4 {
public void testcasefour() throws IOException {
		String bodydata = jsonfile.uploadjsonfile("../VG/src/test/java/org/testing/Payloads/updatedata.json");
		bodydata = replace.replacevalue(bodydata, "id", TC1.responseidValue);
		Properties pr = propertiesfile.uploadpropertiesfile("../VG/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.update(bodydata, "QA_Env_videogames_URI", TC1.responseidValue);
		System.out.println("**********************TC4********************");
		
	
	
      System.out.println("id : "+ http.xmlpath(http.string(res)).getInt("videoGame.id"));
      System.out.println("name : "+http.xmlpath(http.string(res)).getString("videoGame.name"));
      System.out.println("category : "+http.xmlpath(http.string(res)).getString("videoGame.@category"));
        
		System.out.println("Status code is " + res.statusCode());
		System.out.println("response data is "+prettyprinting.jsonPrettyPrinting(conversion.xmltojson(res.asString())));
		
		
		
	}
}
