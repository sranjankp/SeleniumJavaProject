package Testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC002_Get_Single_Employee_Record extends TestBase {
	@BeforeClass
	void getAllEmployee() throws InterruptedException
	{
		log.info("********Started TC00*********");
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		httprequest=RestAssured.given();
		response=httprequest.request(Method.GET,"/employee/"+empID);
		Thread.sleep(3000);
	}
	@Test
	void checkResponcebody()
	{
		log.info("********Checking Body*********");
		String body = response.body().asString();
		log.info("Responebody=="+body);
		Assert.assertEquals(body.contains(empID), true);;
		
	}
	  void checkstatuscode()
	    {
			log.info("********Checking Statuscode*********");
	        int statuscode = response.getStatusCode();
			log.info("statuscode=="+statuscode);
			Assert.assertEquals(statuscode, 200);
			
	    }
		@Test
		void checkreponsetime()
		{
			log.info("********Checking Responsetime*********");
			long time = response.getTime();
			log.info("reponsetime=="+time);
	        Assert.assertTrue(time<2000);
		}

}
