package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElementMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Accessories')]/../../..//a[contains(text(),'Computers')])[1]")).click();
		//driver.findElement(By.xpath("(//a[contains(text(),'Cell phones')]/../../..//a[contains(text(),'Electronics')])[1]")).click();
	}

}
