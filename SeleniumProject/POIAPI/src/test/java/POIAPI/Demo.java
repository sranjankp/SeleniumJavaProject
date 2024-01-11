package POIAPI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	public static void main(String[] args) throws IOException {
		FileInputStream  fis= new FileInputStream("C:\\Users\\sranjank\\Pictures\\Saved Pictures\\ExcelTestData.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(fis);
		int sn=w.getNumberOfSheets();
		System.out.println(sn);
		for(int i=0;i<=sn;i++)
		{
			if(w.getSheetName(i).equalsIgnoreCase("SheetA")) {
				XSSFSheet s= w.getSheetAt(i);	
				Iterator<Row> r= s.iterator();
				Row fr = r.next();
				Iterator<Cell> frc = fr.iterator();
				while(frc.hasNext())
				{
					System.out.println(frc.next().getStringCellValue());
				}
				
			}
			
		}
	}

}
