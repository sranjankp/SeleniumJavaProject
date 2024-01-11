package testscripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class L6_UsernameAndPassword {
	@Test
	void username()
	{
		RestAssured.baseURI="https://www.youtube.com";//change the url this is not working
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET,"/redirect?event=video_description&redir_token=QUFFLUhqbHBtVWtQbDdYNS11Y2ZHdDJVUHJUVjVoS3FrZ3xBQ3Jtc0tuVThmcldmU0VkeTR0S05JNGg4MnFoTVBmeS1qR3J4cy1KeFhnaUpQemhTaE1CYU1iYm1uMGFRWlZJN2NjNzk5aE40dzJrQ2h5UUpna0E2SmJPcDgwM3lranMyVW9waHlSZi1kQkpxYll3eXVwaTZzRQ&q=https%3A%2F%2Fpostman-echo.com%2Fbasic-auth&v=mc3VVGcyP1Q");
		//Basic Authentication
		PreemptiveBasicAuthScheme s=new PreemptiveBasicAuthScheme();
		s.setUserName("postman");
		s.setPassword("password");
		RestAssured.authentication=s;
		String body = response.getBody().asString();
		System.out.println(body);
		int code = response.getStatusCode();
		System.out.println(code);
		
		
	}

}
