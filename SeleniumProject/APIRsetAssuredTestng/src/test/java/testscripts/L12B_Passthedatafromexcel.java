package testscripts;

import java.io.IOException;

import javax.sound.sampled.AudioSystem;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class L12B_Passthedatafromexcel {
	@Test(dataProvider="getempdata")
	void registration(String ENAME,String EAGE,String ESAL) throws InterruptedException
	{
	RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
	RequestSpecification httprequest = RestAssured.given();
    JSONObject reuestparameter=new JSONObject();
    reuestparameter.put("name", ENAME);
    reuestparameter.put("salari",EAGE );
    reuestparameter.put("age", ESAL);
    httprequest.header("Content-Type","application/json");
    httprequest.body(reuestparameter.toJSONString());
	Response response = httprequest.request(Method.POST,"/create");

    //body
    String body = response.body().asString();
    System.out.println(body);
   /* Assert.assertEquals(body.contains(ENAME),true );
    Assert.assertEquals(body.contains(EAGE),true );
    Assert.assertEquals(body.contains(ESAL), true);*/
    Thread.sleep(5000);
	//status code
	int statuscode = response.getStatusCode();
	System.out.println(statuscode);
	}
	@DataProvider
    String[][] getempdata() throws IOException
    {
	   String path = System.getProperty("user.dir")+"/src/test/java/testscripts/SHASHI.xlsx";
       XSSFWorkbook wb=new XSSFWorkbook(path);
       XSSFSheet sheet = wb.getSheet("Sheet1");
       int rowno = sheet.getLastRowNum();
       System.out.println(rowno);
       XSSFRow rows = sheet.getRow(0);
      // System.out.println(rows);  
       int cellno = rows.getLastCellNum();
       System.out.println(cellno);
       String empdata[][]= new String[rowno][cellno];
       for(int i=1;i<rowno;i++)
       {
           for(int j=0;j<cellno;j++)
           {
        	   empdata[i - 1][j]=L12A_Excell2.getdata(path, "Sheet1", i, j);
     
        	  
           }
           
       }

       return empdata;
    }

}
