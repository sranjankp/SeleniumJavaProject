package testscripts;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class L11_WriteExcell {

	public static  void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir")+"/src/test/java/testscripts/Kumar.xlsx";
		FileInputStream f= new FileInputStream(path);
	       XSSFWorkbook wb=new XSSFWorkbook(f);
	      XSSFSheet sheet = wb.getSheet("Sheet1");
	     int rn = sheet.getLastRowNum();
	     System.out.println(rn);
	     String[] data= {"RIYA","NEHA","SHIPRA"};
	    XSSFRow row = sheet.createRow(rn+1);
	     for(int j=0;j<3;j++)
	     {
	    XSSFCell cell = row.createCell(j);
	    cell.setCellValue(data[j]);
	     }
         FileOutputStream fo =new FileOutputStream(path);
         wb.write(fo);
         fo.close();
       int rno = sheet.getLastRowNum();
         System.out.println(rno);
         
	}

}
