package testscripts;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class L9_ExcelDatdaReader {
	@Test
	public void getrowcount() throws IOException
	{
	   	String path = System.getProperty("user.dir")+"/src/test/java/testscripts/SHASHI.xlsx";
		System.out.println(path);
		XSSFWorkbook workbook=new XSSFWorkbook(path);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		System.out.println(row);
	}
	@Test
    public void getcellcount() throws IOException
    {
		String path = System.getProperty("user.dir")+"/src/test/java/testscripts/SHASHI.xlsx";
		System.out.println(path);
		XSSFWorkbook workbook=new XSSFWorkbook(path);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		short cell = row.getLastCellNum();
		System.out.println(cell);
    }
}
