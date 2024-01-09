package testscripts;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class L4_Header {
	@Test
	void header()
	{
		Logger l = LogManager.getLogger(L4_Header.class.getName());
        l.info("shashi");
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET,"/users?page=2");
		 String body = response.getBody().asString();
	        l.info(body);

		//System.out.println(body);
		
		//validation of content header
		String hedercontenttype = response.header("Content-Type");//capture details of content header
        l.info(hedercontenttype);
		Assert.assertEquals(hedercontenttype, "application/json; charset=utf-8");
		
		//validation of content header
		String headerdate = response.header("Date");//capture details of Date header
        l.info(headerdate);
       // Assert.assertEquals(headerdate, "Thu, 08 Dec 2022 04:41:56 GMT");		
	}

}
