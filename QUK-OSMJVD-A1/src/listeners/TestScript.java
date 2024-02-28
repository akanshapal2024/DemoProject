package listeners;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClassIT {
	
	@Test
	public void Demo() throws InterruptedException
	{
		Reporter.log("Testcase passed", true);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Akansha");
		driver.findElement(By.id("LastName")).sendKeys("Pal");
		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Pal123");
		driver.findElement(By.id("ConfirPassword")).sendKeys("Pal123");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
	}

}
