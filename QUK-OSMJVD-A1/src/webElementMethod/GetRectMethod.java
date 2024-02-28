package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Rectangle button = driver.findElement(By.id("newsletter-subscribe-button")).getRect();
		System.out.println(button.getHeight());
		System.out.println(button.getWidth());
		System.out.println(button.getX());
		System.out.println(button.getY());
	}

}
