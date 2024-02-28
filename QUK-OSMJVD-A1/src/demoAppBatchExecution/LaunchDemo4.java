package demoAppBatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchDemo4 {
	@Test(groups = "FT")
	public void demo4()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("daniel");
		driver.findElement(By.id("LastName")).sendKeys("potter");
		driver.findElement(By.id("Email")).sendKeys("daniel21@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("potter1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("potter1234");
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}

}
