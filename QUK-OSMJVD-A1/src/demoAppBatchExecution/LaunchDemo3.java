package demoAppBatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchDemo3 {
	@Test
	public void demo3()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Peter");
		driver.findElement(By.id("LastName")).sendKeys("tiger");
		driver.findElement(By.id("Email")).sendKeys("petertiger@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("tiger1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("tiger1234");
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}

}
