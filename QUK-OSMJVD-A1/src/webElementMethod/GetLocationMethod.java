package webElementMethod;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Point location = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
	}

}
