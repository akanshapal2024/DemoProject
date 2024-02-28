package testNGMethod;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnonationMethod1 {
	  		WebDriver driver;
		String url = "https://demowebshop.tricentis.com/";
		
		@BeforeSuite
		public void setUp() {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("the setup process is completed");
		}
		@BeforeTest
		public void profileSetup() {
			driver.manage().window().maximize();
	        System.out.println("The profile setup process is completed");
		}
		@BeforeClass
		public void appSetup()
	    {
	        driver.get(url);
	        System.out.println("The app setup process is completed");
	    }
		@BeforeMethod
		public void checkLogin() 
		{
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys("Akansha");
			driver.findElement(By.id("LastName")).sendKeys("Pal");
			driver.findElement(By.id("Password")).sendKeys("Akansha@6192");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("Akansha@6192");
			System.out.println("Login process is completed");
		}
		
		@AfterMethod
		public void screenShot() throws IOException 
		{
			LocalDateTime dateTime = LocalDateTime.now();
			   String date = dateTime.toString().replace(":","-");
			   
			   TakesScreenshot ts = (TakesScreenshot)driver;
			   File source = ts.getScreenshotAs(OutputType.FILE);
			   File target = new File("errorScreenShot//"+ date +"screenShot.png");
			   FileHandler.copy(source, target);
		}
		
		 @AfterClass
		    public void closeUp()
		    {
		        driver.close();
		        System.out.println("The close_up process is completed");
		    }
		 
		    
		 @AfterTest
		    public void reportReady()
		    {
		        System.out.println("Report is ready to be shared, with screenshots of tests");
		    }
		 
		 @AfterSuite
		  public void cleanUp()
		    {
		        System.out.println("All close up activities completed");
		    }
	}


