package testNGMethod;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationMethod {
	@Test //5
	public void action() {
		Reporter.log("user has performed actions",true);
	}
	@BeforeSuite //1
	public void dataBase() {
		Reporter.log("connected with database",true);
	}
	@AfterClass //7
	public void closeBrowser() {
		Reporter.log("close the browser",true);
	}
	@BeforeTest //2
	public void preCondition() {
		Reporter.log("Precondition to launch",true);
	}
	@BeforeClass //3
	public void launch() {
		Reporter.log("launch the application",true);
	}
	@BeforeMethod //4
	public void login() {
		Reporter.log("login actions",true);
	}
	@AfterMethod //6
	public void logout() {
		Reporter.log("user has logout",true);
	}
	@AfterSuite //9
	public void closeConnection() {
		Reporter.log("close connection between database",true);
	}
	@AfterTest //8
	public void postCondition() {
		Reporter.log("post conditions",true);
	}

}
