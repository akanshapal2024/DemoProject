package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchDominos {
	@Test(groups = "food")
	public void dominos()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dominos.co.uk/?gad_source=1&gclid=CjwKCAiAlJKuBhAdEiwAnZb7lb1f96RkcuwVvRmn68mmSR9w3Bf2JAyq7m0t-59qX_o5QQdYw6sDgxoC29QQAvD_BwE");
		driver.quit();
	}
}
