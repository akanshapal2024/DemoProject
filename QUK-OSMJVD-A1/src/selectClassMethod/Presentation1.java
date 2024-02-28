package selectClassMethod;

/* Select class by Single drop down */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Presentation1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.id("ez-accept-necessary")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement opt = driver.findElement(By.id("continents"));
		Select sel = new Select(opt);
		
		// to check drop down selected is single or multiple
		System.out.println(sel.isMultiple());
		
		// to select the option by visible text 
		sel.selectByVisibleText("Europe");

		// to get the options present inside drop down
		List<WebElement> options = sel.getOptions();
		for(WebElement var:options)
		{
			System.out.println(var.getText());
		}
	}

}
