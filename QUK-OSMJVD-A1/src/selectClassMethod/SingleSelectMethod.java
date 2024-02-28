package selectClassMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement opt = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(opt);
		// to check the drop down selected is single or multiple
		//System.out.println(sel.isMultiple());
		
		//selected the visible text option
		//sel.selectByVisibleText("Name: A to Z");
		
		// to get the options present inside drop down
		List<WebElement> options = sel.getOptions();
		for(WebElement var:options)
		{
			System.out.println(var.getText());
		}
	}

}
