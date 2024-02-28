package popUpMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarPopUpMethod {
	public static void main(String[] args) throws InterruptedException {
		 
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			ChromeDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://in.via.com/");
			driver.findElement(By.id("departure")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='vc-month-box-head-cell '])[1]/../..//div[text()='24']")).click();

	}

}
