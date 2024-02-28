package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2Dream11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		//driver.switchTo().frame("send-sms-iframe");
		
		WebElement iframe = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.id("regEmail")).sendKeys("9875437654");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.id("hamburger")).click();
	}

}
