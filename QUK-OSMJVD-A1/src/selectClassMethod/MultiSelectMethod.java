package selectClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement m1 = driver.findElement(By.id("multiselect1"));
		Select sel = new Select(m1);
		System.out.println(sel.isMultiple());
		
		//selected by value
		sel.selectByValue("volvox");
		Thread.sleep(2000);
		
		//selected by visible text
		sel.selectByVisibleText("Swift");
		Thread.sleep(1000);
		
		sel.selectByVisibleText("Hyundai");
		Thread.sleep(1000);
		
		sel.selectByVisibleText("Audi");
		Thread.sleep(1000);
		
		//deselected by index
		sel.deselectByIndex(2);
		
		//fetching 1st selected option
		WebElement opt = sel.getFirstSelectedOption();
		System.out.println(opt.getText());
		
		//driver.findElement(By.id(""))
	}

}
