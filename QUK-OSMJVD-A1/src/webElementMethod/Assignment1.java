package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-female")).click();
		System.out.println(driver.findElement(By.id("gender-female")).isSelected());
		
		driver.findElement(By.id("FirstName")).sendKeys("Akansha");
		System.out.println(driver.findElement(By.id("FirstName")).getAttribute("value"));
		
		driver.findElement(By.id("LastName")).sendKeys("Pal");
		System.out.println(driver.findElement(By.id("LastName")).getAttribute("value"));
		
		driver.findElement(By.id("Email")).sendKeys("pal.akansha6192@gmail.com");
		System.out.println(driver.findElement(By.id("Email")).getAttribute("value"));
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Akansha@6192");
		System.out.println(driver.findElement(By.id("ConfirmPassword")).getAttribute("value"));
		
		driver.findElement(By.id("register-button")).click();
		
		System.out.println(driver.findElement(By.xpath("//span[text()='Password is required.']")).getText());
	}

}
