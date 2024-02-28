package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learningIdLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		// find element using id locator
		driver.findElement(By.id("small-searchterms"));
		
		// find element using name locator
		driver.findElement(By.name("NewsletterEmail"));
	}

}
