package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.findElement(By.xpath("//span[text()='Wishlist']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@value='Search']")).isDisplayed());
		
	}

}
