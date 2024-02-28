package dataDrivenMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws IOException {
		//1- Create a File("path")
				File file = new File("./testDataFolder/testData1.properties");
				
				//2- Create a object for FileInputStream
				FileInputStream fis = new FileInputStream(file);
				
				//3- Create a object for Property File
				Properties p = new Properties();
				
				//4- Call load(fis) method
				p.load(fis);
				
				//5- Use getProperty() method to get the values
				String Key = p.getProperty("key").toString();
				String Path = p.getProperty("path").toString();
				String URL = p.getProperty("url").toString();
				String firstName = p.getProperty("Firstname").toString();
				String lastName = p.getProperty("Lastname").toString();
				String email = p.getProperty("Email").toString();
				String passWord = p.getProperty("Password").toString();
				String confirm_Password = p.getProperty("Confirmpassword").toString();
				
				System.out.println(Key);
				System.out.println(Path);
				System.out.println(URL);
				System.out.println(firstName);
				System.out.println(lastName);
				System.out.println(email);
				System.out.println(passWord);
				System.out.println(confirm_Password);
				
				System.setProperty(Key, Path);
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(URL);
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.id("gender-female")).click();
				driver.findElement(By.id("FirstName")).sendKeys(firstName);
				driver.findElement(By.id("LastName")).sendKeys(lastName);
				driver.findElement(By.id("Email")).sendKeys(email);
				driver.findElement(By.id("Password")).sendKeys(passWord);
				driver.findElement(By.id("ConfirmPassword")).sendKeys(confirm_Password);
				
	}

}
