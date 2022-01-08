package org.testing.responsevalidation;

import org.testng.Assert;
import com.jayway.restassured.response.Response;

public class responsevalidation {
	
	public static void statuscodevalidation(String expectedcode, Response res) {
		
			
			Assert.assertEquals(res.statusCode(),expectedcode,"status code is not matching");
	
	}

}
