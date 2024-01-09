package Testcase;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilities.RestUtills;
import base.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC004_Put_Employee_Records extends TestBase {
	String empname=RestUtills.empName();
	String empsal=RestUtills.empSal();
	String empage=RestUtills.empAge();
	@BeforeClass
	void createEmployee() throws InterruptedException
	{
		log.info("****************StartedTC004_Post_Employee_Records******************* ");
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		httprequest=RestAssured.given();
		JSONObject requestparameter= new JSONObject();
		requestparameter.put("name", empname);
		requestparameter.put("salary", empsal);
		requestparameter.put("age", empage);
		httprequest.header("Content-Type","application/json");
		httprequest.body(requestparameter.toJSONString());
		response=httprequest.request(Method.PUT,"/update/"+empID);
		Thread.sleep(3000);
	}
	@Test
	void checkbody() 
	{
		log.info("*****Checking body*****");
		String body = response.getBody().asString();
		log.info("body====="+body);
		Assert.assertEquals(body.contains(empname), true);
		Assert.assertEquals(body.contains(empsal), true);
    	Assert.assertEquals(body.contains(empage), true);
	}
	@Test
	void checkStatuscode() 
	{
		log.info("*****Checking Statuscode*****");
		int code = response.getStatusCode();
		log.info("code====="+code);
		Assert.assertEquals(code,200);
	}
	@Test
	void checkStatusLine() 
	{
		log.info("*****Checking StatusLine*****");
		 String StatusLine = response.getStatusLine();
		log.info("StatusLine====="+StatusLine);
		Assert.assertEquals(StatusLine,"HTTP/1.1 200 OK");
	}
	@AfterClass
	void end()
	{
		log.info("***END****");
	}
	
	


}
