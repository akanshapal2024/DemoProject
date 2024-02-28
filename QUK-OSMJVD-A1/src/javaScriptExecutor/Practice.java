package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.id("show-textbox")).click();
		//driver.findElement(By.id("hide-textbox")).click();
		js.executeScript("document.getElementById('displayed-text').value='automation';");
	}

}
