package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Akansha");
		// to get the value present in firstname
		System.out.println(driver.findElement(By.id("FirstName")).getAttribute("value"));
		driver.findElement(By.id("LastName")).sendKeys("Pal");
		driver.findElement(By.id("register-button")).click();
		// This is to fetch your error message in the webpage using GetText
		System.out.println(driver.findElement(By.xpath("//span[text()='Email is required.']")).getText());
		// This is to fetch the normal text present in webpage using GetText
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store']")).getText());
		
	}

}
