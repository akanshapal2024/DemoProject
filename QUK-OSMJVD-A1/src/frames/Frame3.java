package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://google.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    WebElement element = driver.findElement(By.xpath("//div[text()='Accept all']"));
		if(element != null)
		{
			element.click();
		}
		WebElement element1 = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		element1.click();
		driver.switchTo().frame("app");
	    WebElement element2 = driver.findElement(By.xpath("//span[@data-text='Account']"));
	    element2.click();
	    WebElement element3 = driver.findElement(By.xpath("(//a[@aria-label='Go to your Google Account'])[2]"));
	    element3.click();
	}

}
