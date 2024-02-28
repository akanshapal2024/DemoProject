package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInGoogle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@role='button']")).click();
		Thread.sleep(3000);
		WebElement iframe = driver.findElement(By.name("app"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
	}

}
