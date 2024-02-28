package selectClassMethod;

/* Select class by multiple drop down */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Presentation2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.id("ez-accept-necessary")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement multiple = driver.findElement(By.id("selenium_commands"));
		Select sel = new Select(multiple);
		
		// to check drop down is single or multiple
		System.out.println(sel.isMultiple());
		
		// to select the option by visible text
		sel.selectByVisibleText("Browser Commands");
		Thread.sleep(1000);
		sel.selectByVisibleText("Navigation Commands");
		Thread.sleep(1000);
		sel.selectByVisibleText("Switch Commands");
		Thread.sleep(1000);
		sel.selectByVisibleText("Wait Commands");
		Thread.sleep(1000);
		sel.selectByVisibleText("WebElement Commands");
		Thread.sleep(1000);
		
		
		// to deselect the option by visible text
		//sel.deselectByVisibleText("Navigation Commands");
		//Thread.sleep(1500);
		//sel.deselectByVisibleText("Wait Commands");
	   //Thread.sleep(1500);
		// to deselect them all
		//sel.deselectAll();
		
		// Fetching first selected option
		WebElement option = sel.getFirstSelectedOption();
		System.out.println(option.getText());
	}

}
