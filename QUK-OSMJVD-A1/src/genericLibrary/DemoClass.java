package genericLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoClass extends BaseClass{

	@Test
	public void script() throws InterruptedException {
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		WebElement option = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(option);
		sel.selectByVisibleText("Name: Z to A");
		WebElement opt = driver.findElement(By.id("products-pagesize"));
		Select sel1 = new Select(opt);
		sel1.selectByVisibleText("12");
		WebElement opt1 = driver.findElement(By.id("products-viewmode"));
		Select sel2 = new Select(opt1);
		//sel2.selectByVisibleText("List");
	}
}
