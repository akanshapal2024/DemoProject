package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Akansha");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Pal");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("a@b.com");
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Test Company");
		driver.findElement(By.linkText("Let's Go")).click();
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}

}
