package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pom_Repositry {
	
	public Pom_Repositry(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

}
