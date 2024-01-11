package testscripts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class L7_1_CreateNewBody {
	@Test
	void jasonpath()
	{
		RestAssured.baseURI="https://webservice.toscacloud.com/training/api/Coffees";
		RequestSpecification httprequest = RestAssured.given();
		//pass value
		JSONObject reuqestparameter=new JSONObject();
		reuqestparameter.put("Id", "14");
		reuqestparameter.put("Name", "Ranjan");
		reuqestparameter.put("Description", "Kumar");
		
		httprequest.header("Content-Type","application/json");
		
		//attch above data to the request 
		httprequest.body(reuqestparameter.toJSONString());
		//response
		Response response = httprequest.request(Method.POST,"/b69ba25c-4e0c-79a7-c0c8-e77dc67df615");
		
		String body = response.getBody().asString();
		System.out.println(body);
		//status code
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
		//id validation
		Object id = response.jsonPath().get("Id");
		System.out.println(id);
		Assert.assertEquals(body.contains("Id"),true);
		//2nd method
		JsonPath js= new JsonPath(body);	
		String i = js.getString("id");
		System.out.println(i);
		
	}

}
