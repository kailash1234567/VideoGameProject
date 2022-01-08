package org.testing.testSteps;



import java.util.Properties;




import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.path.xml.XmlPath;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;





public class HTTPMethods {
	Properties pr;
	public HTTPMethods(Properties pr) {
		this.pr = pr;
		
	}

	public  Response post(String bodydata, String urikey) {

				Response res=
				
				given()
			     .contentType(ContentType.JSON)
			     .body(bodydata)
			    .when()
				  .post(pr.getProperty(urikey));
				
			   
	 return res;
	 
	}
	public Response get(String urikey, String id) {
	    String uri = pr.getProperty(urikey)+"/"+id;
	    Response res=
	    		
	    		given()
	    		.contentType(ContentType.JSON)
	    		.when()
	    		.get(uri);
		
		return res;
	}
	public Response getall(String urikey) {
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(urikey));
		return res;
	}
	public Response update(String bodydata,String urikey, String id) {
		String uri=pr.getProperty(urikey)+"/"+id;
		Response res =
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.put(uri);
				
	
		return res;
	}
	public Response delete(String urikey, String id) {
		
		String uri = pr.getProperty(urikey)+"/"+id;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
				
				return res;
	}
	public  String string(Response res) {
		
		String string = res.then().extract().response().asString();
		return string;
	}
	public   XmlPath xmlpath(String res) {
		
		XmlPath xml = new XmlPath(res);
		return xml;
		
		
	}
	public   JsonPath jsonpath(String res) {
		
		JsonPath json = new JsonPath(res);
		return json;
		
		
	}

}
