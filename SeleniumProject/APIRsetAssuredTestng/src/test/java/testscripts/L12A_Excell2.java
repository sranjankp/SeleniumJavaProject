package testscripts;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class L12A_Excell2 {
 
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static 
	
    String getdata(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
    {
       fi=new FileInputStream(xlfile);
       wb=new XSSFWorkbook(fi);
       ws = wb.getSheet(xlsheet);
       row=ws.getRow(rownum);
       cell=row.getCell(colnum);
       String data;
    
        	  try {
               DataFormatter format=new DataFormatter();
               String celldata = format.formatCellValue(cell);
               return celldata;
        	  }
        	  catch(Exception e)
        	  {
        		  data="";
        	  }
        	  wb.close();
        	  fi.close();
        	  return data;
 
    }

}
