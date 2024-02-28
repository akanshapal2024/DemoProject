package actionClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo())
		driver.findElement(By.xpath("//a[@role='button']")).click();
		driver.findElement(By.xpath("//span[@class='MrEfLc']")).click();
		}

}
