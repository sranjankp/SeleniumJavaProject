package testscripts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class L7_PassValue {
	@Test
	void Registrationsuccesfuly()
	{
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification httprequest = RestAssured.given();
		//pass value
		JSONObject reuqestparameter=new JSONObject();
		reuqestparameter.put("email", "eve.holt@reqres.in");
		reuqestparameter.put("password", "pistol");
		
		httprequest.header("Content-Type","application/json");
		
		//attch above data to the request 
		httprequest.body(reuqestparameter.toJSONString());
		//response
		Response response = httprequest.request(Method.POST,"/register");
		
		String body = response.getBody().asString();
		System.out.println(body);
		//status code
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
		//id validation
		Object id = response.jsonPath().get("id");
		System.out.println(id);
		Assert.assertEquals(id, 4);
		//2nd method
		JsonPath js= new JsonPath(body);	
		String i = js.getString("id");
		System.out.println(i);

		
		
	}

}
