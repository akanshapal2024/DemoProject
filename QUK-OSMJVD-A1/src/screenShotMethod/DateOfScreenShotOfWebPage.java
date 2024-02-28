package screenShotMethod;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DateOfScreenShotOfWebPage {
	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.get("https://demowebshop.tricentis.com/");
		   LocalDateTime dateTime = LocalDateTime.now();
		   String date = dateTime.toString().replace(":","-");
		   
		   TakesScreenshot ts = (TakesScreenshot)driver;
		   File source = ts.getScreenshotAs(OutputType.FILE);
		   File target = new File("errorScreenShot//"+ date +"screenShot.png");
		   FileHandler.copy(source, target);
		
	}

}
