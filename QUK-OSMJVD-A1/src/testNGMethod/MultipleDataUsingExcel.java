package testNGMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDataUsingExcel {
	@DataProvider
	public String[][] testData() throws EncryptedDocumentException, IOException{
		File file = new File("./testDataFolder/DemoWebSheet.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		int noOfRow = wb.getSheet("Sheet2").getPhysicalNumberOfRows();
		int noOfCol = wb.getSheet("Sheet2").getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[noOfRow][noOfCol];
		for(int i=0;i<noOfRow;i++)
		{
			for(int j=0;j<noOfCol;j++)
			{
				data[i][j]= wb.getSheet("Sheet2").getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
	
	@Test(dataProvider = "testData")
	public void registerdata(String[] testData) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		if(testData[0].equalsIgnoreCase("female"))
        {
	        driver.findElement(By.id("gender-female")).click();
        }
        else {
        	driver.findElement(By.id("gender-male")).click();
        }
        driver.findElement(By.id("FirstName")).sendKeys(testData[1]);
        driver.findElement(By.id("LastName")).sendKeys(testData[2]);
        driver.findElement(By.id("Email")).sendKeys(testData[3]);
        driver.findElement(By.id("Password")).sendKeys(testData[4]);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(testData[5]);
        driver.findElement(By.id("register-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys(testData[6]);
        driver.findElement(By.id("Password")).sendKeys(testData[7]);
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        Thread.sleep(2000);
        driver.quit();
	}

}
