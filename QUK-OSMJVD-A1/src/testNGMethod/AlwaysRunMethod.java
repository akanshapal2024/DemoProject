package testNGMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlwaysRunMethod {
	WebDriver driver;
	@Test(alwaysRun = true)
	public void demo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Akansha");
		driver.findElement(By.id("LastName")).sendKeys("Pal");
		Thread.sleep(2000);
		//driver.quit();
	}
	@Test(alwaysRun = true)
    public void logout() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("Password")).sendKeys("Akansha@6192");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Akansha@6192");
		
	}
}
