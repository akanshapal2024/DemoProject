package dataDrivenMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTestDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file = new File("./testDataFolder/DemoWebSheet.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		
		String key = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String path = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		String url = wb.getSheet("Sheet1").getRow(5).getCell(2).getStringCellValue();
		String firstName = wb.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
		String lastName = wb.getSheet("Sheet1").getRow(6).getCell(1).getStringCellValue();
		String email = wb.getSheet("Sheet1").getRow(8).getCell(3).getStringCellValue();
		String password = wb.getSheet("Sheet1").getRow(9).getCell(1).getStringCellValue();
		String confirmPassword = wb.getSheet("Sheet1").getRow(11).getCell(2).getStringCellValue();
		LocalDateTime date = wb.getSheet("Sheet1").getRow(7).getCell(2).getLocalDateTimeCellValue();
		
		System.setProperty(key,path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println(key);
		System.out.println(path);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
		System.out.println(confirmPassword);
		System.out.println(date);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		
		
		
	}

}
