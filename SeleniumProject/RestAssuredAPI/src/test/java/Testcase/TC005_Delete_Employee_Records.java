package Testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;

public class TC005_Delete_Employee_Records extends TestBase{
	@BeforeClass
	void getAllEmployee() throws InterruptedException
	{
		log.info("********Started TC005*********");
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		httprequest=RestAssured.given();
		response=httprequest.request(Method.GET,"/employees");
		// First get the JsonPath object instance from the response interface
		JsonPath jsonpathevaluator = response.jsonPath();
		//Capture Id
		String empId = jsonpathevaluator.get("[0].id");
		response=httprequest.request(Method.DELETE,"/delete/"+empId);//Pass ID to delete record
		Thread.sleep(5000);
	}
	@Test
	void checkResponcebody()
	{
		log.info("********Checking Body*********");
		String body = response.body().asString();
		log.info("Responebody=="+body);
		Assert.assertEquals(body.contains("Successfully! Record has been deleted"), true);;
		
	}

}
