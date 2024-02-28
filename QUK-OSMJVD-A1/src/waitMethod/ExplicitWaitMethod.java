package waitMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.findElement(By.linkText("Register")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Jewelry")));
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Akansha");
       // wait.until(ExpectedConditions.elementToBeSelected(By.id("gender-male")));
        driver.findElement(By.id("LastName")).sendKeys("Pal");
}
}
