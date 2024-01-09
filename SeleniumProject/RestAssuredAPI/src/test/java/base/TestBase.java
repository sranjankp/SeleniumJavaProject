package base;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBase {
	public static RequestSpecification httprequest;
	public static Response  response;
	public String empID="11";
	public Logger log;
	@BeforeClass
	public void setup()
	{
	 log = LogManager.getLogger(TestBase.class.getName());
	}
	
	

}
