package demoAppBatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchDemo5 {
	@Test
	public void demo5()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("jasmine");
		driver.findElement(By.id("LastName")).sendKeys("marigold");
		driver.findElement(By.id("Email")).sendKeys("jasmine4563@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("marigold1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("marigold1234");
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}

}
