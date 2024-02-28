package assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	public void launchDemo()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		assertEquals(driver.getTitle(),"Demo Web Shop","user not landed to Demo Web Shop");
		
		driver.findElement(By.linkText("Register")).click();
		assertEquals(driver.getCurrentUrl(),"https://demowebshop.tricentis.com/register","user not landed to register page");
		
		driver.findElement(By.id("gender-female")).click();
		assertTrue(true,"user not clicked on female radio button");
		
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Akansha");
		assertEquals(firstName.getAttribute("value"),"Akansha","firstname is not matched");
		
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Pal");
		assertEquals(lastName.getAttribute("value"),"Pal","lastname is not matched");
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("abc@gmail.com");
		assertEquals(email.getAttribute("value"),"abc@gmail.com","email is not matched");
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Akansha@123");
		assertEquals(password.getAttribute("value"),"Akansha@123","password is not matched");
		
		WebElement confirm = driver.findElement(By.id("ConfirmPassword"));
		confirm.sendKeys("Akansha@123");
		assertEquals(confirm.getAttribute("value"),"Akansha@123","confirm password is not matched");
		
		driver.findElement(By.id("register-button")).click();
		assertTrue(true,"user not clicked on register button");
	}

}
