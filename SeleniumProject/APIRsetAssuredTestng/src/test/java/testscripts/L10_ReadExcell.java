package testscripts;

import org.testng.Assert;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class L10_ReadExcell {
	@Test
	void get() throws IOException
	{
		   String path = System.getProperty("user.dir")+"/src/test/java/testscripts/Kumar.xlsx";
		   FileInputStream f= new FileInputStream(path);
	       XSSFWorkbook wb=new XSSFWorkbook(f);
	       XSSFSheet sheet = wb.getSheet("Sheet1");
	       int rowno = sheet.getLastRowNum();
	       System.out.println(rowno);
	       XSSFRow rows = sheet.getRow(0);
	       int cellno = rows.getLastCellNum();
	       System.out.println(cellno);
	       for(int i=0;i<=rowno;i++)
	       {
	    	   for(int j=0;j<cellno;j++)
	    	   {
	    		 XSSFRow row = sheet.getRow(i);
	    		XSSFCell cell = row.getCell(j);
	    		String data = cell.getStringCellValue();
	    		System.out.print(data+" ");
	    		   
	    	   }
	    	   System.out.println();
	       } 
	    
	      
	      
	}
}