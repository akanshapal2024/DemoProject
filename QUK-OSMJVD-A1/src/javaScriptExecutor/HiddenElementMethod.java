package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='https://www.skillrary.com/iplang/en']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.id("usertype_yes")).click();
		js.executeScript("document.getElementById('groupcode').value='automation';");

	}

}
