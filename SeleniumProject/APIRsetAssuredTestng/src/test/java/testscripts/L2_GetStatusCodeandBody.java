package testscripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class L2_GetStatusCodeandBody {
	@Test
	void getweatherdetails()
	{ 
		//specify base uri
		RestAssured.baseURI="https://reqres.in/api";
		//requst object
		RequestSpecification httprequest = RestAssured.given();
		//response 0bject
		Response response = httprequest.request(Method.GET,"/users?page=2");
		//response
		String body = response.getBody().asString();
		System.out.println(body);
		//status code
		int status = response.getStatusCode();
		System.out.println(status);
		Assert.assertEquals(status, 200);
        //status line verification
		String line = response.getStatusLine();
		System.out.println(line);
		Assert.assertEquals(line,"HTTP/1.1 200 OK");

		
	}

}
