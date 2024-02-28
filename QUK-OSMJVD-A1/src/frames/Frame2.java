package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		    ChromeDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get("https://google.com/");
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        WebElement acceptAllWebElement = driver.findElementByXPath("//div[text()='Accept all']");
	        if(acceptAllWebElement != null) {
	            acceptAllWebElement.click();
	        }
	        WebElement webElement = driver.findElementByXPath("//a[@aria-label='Google apps']");
	        webElement.click();
	        driver.switchTo().frame("app");
	        WebElement webElement2 = driver.findElement(By.xpath("//span[@data-text='YouTube']"));
	        webElement2.click();
	        WebElement element = driver.findElement(By.xpath("//button[@aria-label='Accept the use of cookies and other data for the purposes described']"));
	       // WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Accept all')]/ancestor::button"));
	        if(element != null)
	       {
	    	   //element.click();
	       }
	        
	}

}
