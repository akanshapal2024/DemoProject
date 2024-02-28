package popUpMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page7.html");
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();// clicking on OK button
		//Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();// clicking on cancel button
	}

}
