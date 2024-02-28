package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().to("https://www.linkedin.com/feed/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
