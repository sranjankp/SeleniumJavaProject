package testscripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
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

public class Practice {

	
		@Test(dataProvider="data")
		 public void shashiranjan(int Id, String Name,String Description) {
			RestAssured.baseURI="https://webservice.toscacloud.com/training/api/Coffees";
			RequestSpecification h = RestAssured.given();
			JSONObject o= new JSONObject();
			o.put("Id", Id);
			o.put("Name",Name );
			o.put("Description", Description);
			h.header("Content-Type","aplication/json");
			h.body(o.toJSONString());
			Response r = h.request(Method.POST,"/b69ba25c-4e0c-79a7-c0c8-e77dc67df615");
			String b = r.getBody().asString();
			System.out.println(b);
			//Assert.assertEquals(b.contains(Id),true);
			Assert.assertEquals(b.contains(Name),true);
			Assert.assertEquals(b.contains(Description),true);
			int c = r.getStatusCode();
			System.out.println(c);
			Assert.assertEquals(c, 200);	
			
		}
		String da=null;
		@DataProvider
		public Object[][] data() throws IOException
		{
			String path = System.getProperty("user.dir")+"/src/test/java/testscripts/SHASHI.xlsx";
			FileInputStream f= new FileInputStream(path);
			XSSFWorkbook w=new XSSFWorkbook(f);
			XSSFSheet sh = w.getSheet("Sheet1");
			int rn = sh.getPhysicalNumberOfRows();
			System.out.println(rn);
			XSSFRow r = sh.getRow(0);
			int ce = r.getPhysicalNumberOfCells();
			System.out.println(ce);
			Object s[][]= new Object[rn][ce];
			for(int i=1;i<rn;i++)
			{
				for(int j=0;j<ce;j++)
				{
					
				 s[i-1][j] =sh.getRow(i).getCell(j).toString();
			      
				}
				
			}
			return s;
			
			
			
		}

	}

	