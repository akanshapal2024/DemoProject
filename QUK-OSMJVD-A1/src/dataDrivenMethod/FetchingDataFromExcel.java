package dataDrivenMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//1- Create a file("path")
		File file = new File("./testDataFolder/DemoWebSheet.xlsx");
		
		//2- Create a object for file input stream
		FileInputStream fis = new FileInputStream(file);
		
		//3- Create an object of workbook(interface)and workbook factory is a class
		Workbook wb = WorkbookFactory.create(fis);
		
		double number = wb.getSheet("Sheet1").getRow(12).getCell(0).getNumericCellValue();
	    System.out.println(number);	
	    
	    boolean booleanValue = wb.getSheet("Sheet1").getRow(11).getCell(1).getBooleanCellValue();
	    System.out.println(booleanValue);
	    
	    String stringValue = wb.getSheet("Sheet1").getRow(10).getCell(2).getStringCellValue();
	    System.out.println(stringValue);
	    
	    LocalDateTime date = wb.getSheet("Sheet1").getRow(7).getCell(2).getLocalDateTimeCellValue();
	    System.out.println(date);
	}

}
