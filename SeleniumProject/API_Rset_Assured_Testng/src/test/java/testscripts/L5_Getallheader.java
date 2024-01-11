package testscripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class L5_Getallheader {
	@Test
	void headers()
	{
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET,"/users?page=2");
		Headers allheader = response.headers();
		for(Header header:allheader)
		{
			
		System.out.println(header.getName()+" = "+header.getValue());
		}
	}

}
