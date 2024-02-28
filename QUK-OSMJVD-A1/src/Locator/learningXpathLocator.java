package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learningXpathLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		// 1st syntax
		driver.findElement(By.xpath("//img[@alt='Tricentis demo web shop']"));
		
		// contains for attribute
		driver.findElement(By.xpath("//img[contains(@src,'/Themes/DefaultClean']"));
		
		//contains for text
		driver.findElement(By.xpath("//div[contains(text(),'Copyright © 2024']"));
	}

}
