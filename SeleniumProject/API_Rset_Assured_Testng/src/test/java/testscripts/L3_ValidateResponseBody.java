package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import scala.math.Ordering.SymbolOrdering;

public class L3_ValidateResponseBody {
	@Test
	void body()
	{
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET,"/users/2");
		//validation of body
		String body = response.getBody().asString();
	    System.out.println(body);
		Assert.assertEquals(body.contains("janet.weaver@reqres.in"), true);
		//find the last name of body part
	    JsonPath js= new JsonPath(body);	
	    String lastname=js.getString("data.last_name");
	   System.out.println(lastname);
		
		
	}

}
