package testscripts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class L8_Datadriven {
//	private static final String string = null;
	@Test(dataProvider="dataprovider")
	void Registrationsuccesfuly(String ename,String eage,String esal) throws InterruptedException
	{
		Thread.sleep(5000);
	RestAssured.baseURI="https://webservice.toscacloud.com/training/api/Coffees";
	RequestSpecification httprequest = RestAssured.given();
	//pass value
	JSONObject reuqestparameter=new JSONObject();
	reuqestparameter.put("Id", ename);
	reuqestparameter.put("Name", eage);
	reuqestparameter.put("Description", esal);

	httprequest.header("Content-Type","application/json");
	
	//attch above data to the request 
	httprequest.body(reuqestparameter.toJSONString());
	//response
	Response response = httprequest.request(Method.POST,"/b69ba25c-4e0c-79a7-c0c8-e77dc67df615");
	//BODY
	String body = response.getBody().asString();
	System.out.println(body);
	Assert.assertEquals(body.contains(ename), true);
	Assert.assertEquals(body.contains(eage), true);
	Assert.assertEquals(body.contains(esal), true);

	//status code
	int statuscode = response.getStatusCode();
	System.out.println(statuscode);
	Assert.assertEquals(statuscode, 200);
	
	
}   @DataProvider
    String [][]  dataprovider()
	{
		String s[][]= {{"14","40000","30"},{"15","30000","40"}};
		return(s);
	}
/*@DataProvider
public String[][] getdata()
{
	String[][] data = new String[3][2];
	data[0][0]="abc123";
	data[0][1]="30000";
	data[0][2]="40";
	
	data[1][0]="xyz123";
	data[1][1]="40000";
	data[2][1]="30";
	return data;
	
}*/
}
//,{"xyz123","40000","30"},{"pqr123","80000","80"},{"abc123","30000","40"}