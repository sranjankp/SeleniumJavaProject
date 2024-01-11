package testscripts;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class TestAPI {
	@Test
	public void getUserInPageTwo()
	{
	Response response= given().when().get("https://reqres.in/api/users?page=2");
	int a=response.statusCode();
	ResponseBody r = response.getBody();
	String s = r.asString();
	System.out.println(a);
	System.out.println(r);
	Assert.assertEquals(a, 200);
	Assert.assertTrue(s.contains("Janet"));
	}

}
