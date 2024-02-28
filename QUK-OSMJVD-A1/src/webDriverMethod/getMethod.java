package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.close();
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getPageSource());
	}

}
