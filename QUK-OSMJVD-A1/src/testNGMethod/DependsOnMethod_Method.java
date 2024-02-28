package testNGMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod_Method {
	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("user has login", true);
	}
	@Test
	public void register() {
		Reporter.log("user has registered", true);
	}
	@Test(dependsOnMethods = "login")
	public void logout() {
		Reporter.log("user has logout", true);
	}

}
