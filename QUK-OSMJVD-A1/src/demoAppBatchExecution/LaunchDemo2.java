package demoAppBatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchDemo2 {
	@Test(groups = "FT")
	public void demo2()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("rose");
		driver.findElement(By.id("LastName")).sendKeys("marigold");
		driver.findElement(By.id("Email")).sendKeys("rose5573@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("wxyz1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("wxyz1234");
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}


}
