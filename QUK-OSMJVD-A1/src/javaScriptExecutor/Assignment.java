package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/");
		  
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,500)");
		  
		  driver.findElement(By.linkText("Build your own computer")).click();
		  driver.findElement(By.xpath("(//label[@class='text-prompt'])[3]"));
		  driver.findElement(By.id("product_attribute_16_3_6_19")).click();
		  driver.findElement(By.xpath("(//label[@class='text-prompt'])[4]"));
		  driver.findElement(By.id("product_attribute_16_4_7_21")).click();
		  driver.findElement(By.xpath("(//label[@class='text-prompt'])[5]"));
		  driver.findElement(By.id("product_attribute_16_8_8_24")).click();
		  
		  driver.findElement(By.id("add-to-cart-button-16")).click();
		  
		  LocalDateTime dateTime = LocalDateTime.now();
		  String date = dateTime.toString().replace(":","-");
		   
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  File target = new File("errorScreenShot//"+ date +"screenShot.png");
		  FileHandler.copy(source, target);
		  
	}

}
