package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	String name = "Akansha";
	String lastname = "Pal";
	String Email = "abc@gmail.com";
	String passWord = "abcd@123";
	String Confirm = "abcd@123";
	@Test
	public void launchDemo()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		SoftAssert sa = new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		
		sa.assertEquals(driver.getTitle(),"Demo Web Shop","user not landed to Demo Web Shop");
		
		driver.findElement(By.linkText("Register")).click();
		sa.assertEquals(driver.getCurrentUrl(),"https://demowebshop.tricentis.com/register","user not landed to register page");
		
		driver.findElement(By.id("gender-female")).click();
		sa.assertTrue(true,"user not clicked on female radio button");
		
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys(name);
		sa.assertEquals(firstName.getAttribute("value"),"Akansha","firstname is not matched");
		
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys(lastname);
		sa.assertEquals(lastName.getAttribute("value"),"Pal","lastname is not matched");
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys(Email);
		sa.assertEquals(email.getAttribute("value"),"abc@gmail.com","email is not matched");
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys(passWord);
		sa.assertEquals(password.getAttribute("value"),"abcd@123","password is not matched");
		
		WebElement confirm = driver.findElement(By.id("ConfirmPassword"));
		confirm.sendKeys(Confirm);
		sa.assertEquals(confirm.getAttribute("value"),"abcd@123","confirm password is not matched");
		
		driver.findElement(By.id("register-button")).click();
		sa.assertTrue(true,"user not clicked on register button");
		sa.assertAll();
	}

}
