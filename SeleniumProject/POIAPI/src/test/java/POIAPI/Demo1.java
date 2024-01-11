package POIAPI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream  fis= new FileInputStream("C:\\Users\\sranjank\\Pictures\\Saved Pictures\\ExcelTestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheetCount = workbook.getNumberOfSheets();
		
		for(int i=0;i<sheetCount;i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("Data")) {
				
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				Iterator<Row> rows = sheet.iterator();
				
				Row firstRow = rows.next();
					
				Iterator<Cell> cells = firstRow.iterator();
				
				int c = 0;
				
				int columnpostion = 0;
				
				while(cells.hasNext()) {
					
					Cell cell = cells.next();
					
					if(cell.getStringCellValue().equalsIgnoreCase("Tests")){
						
						columnpostion = c;
						
					}
					
					c++;
					
				}
				System.out.println(columnpostion);
		}
	}

	}
}
