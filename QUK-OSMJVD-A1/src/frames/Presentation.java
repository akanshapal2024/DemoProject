package frames;

/* Iframes */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Presentation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		
		// Switch to frame
		driver.switchTo().frame("iframe-name");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav pull-center dynamic_menu_texts']//a[contains(text(),'HOME')]/parent::li")).click();
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='zen-course-list'])[3]//a[@href='/courses/selenium-webdriver-with-python']")).click();
		Thread.sleep(1000);
		
		// Switch to parent frame
		driver.switchTo().parentFrame();
		}

}
