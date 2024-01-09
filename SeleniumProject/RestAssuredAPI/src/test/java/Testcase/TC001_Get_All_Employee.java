package Testcase;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC001_Get_All_Employee extends TestBase {
	@BeforeClass
	void getAllEmployee() throws InterruptedException
	{
		log.info("********Started TC00*********");
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		httprequest=RestAssured.given();
		response=httprequest.request(Method.GET,"/employees");
		Thread.sleep(3000);
	}
	@Test
	void checkResponcebody()
	{
		log.info("********Checking Body*********");
		String body = response.body().asString();
		log.info("Responebody=="+body);
		Assert.assertTrue(body!=null);
		
	}
	@Test
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
         if(time>2000)
        	log.warn("Responsetime greater than 2000");
        Assert.assertTrue(time<2000);
	}
	@Test
	void checkstatusline()
	{
		log.info("********Checking Statusline*********");
		String line = response.getStatusLine();
		log.info("statusline=="+line);
		Assert.assertEquals(line, "HTTP/1.1 200 OK");

	}
	@Test
	void checkconetenttype()
	{
		log.info("********Checking Contenttype*********");
		String contenttype = response.header("Content-Type");
		log.info("contenttype=="+contenttype);
		Assert.assertEquals(contenttype, "application/json");
		

	}@Test
	void checkservertype() 
	{
		log.info("********Checking Server*********");
		String server = response.header("Server");
		log.info("server=="+server);
		Assert.assertEquals(server, "nginx/1.21.6");

	}
	@Test
	void checkcontentEncoding() 
	{
		log.info("********Checking contentEncoding*********");
		String ContentEncoding = response.header("Content-Encoding");
		log.info("Content-Encoding=="+ContentEncoding);
		Assert.assertEquals(ContentEncoding, "gzip");

	}
	@Test
	void checkcontentLenght() 
	{
		log.info("********Checking Content-Length*********");
		String Contentlenght = response.header("Content-Length");
		log.info("Content-Length=="+Contentlenght);
	}
	@Test
	void checkCookies() 
	{
		log.info("********Checking Cookies*********");
		String Cookies = response.getCookie("PHPSESSID");
	//	log.info("Cookies=="+Cookies);
		
	}
	@AfterClass
	void end()
	{
		log.info("***********Finished TC001***********");
	}
}
