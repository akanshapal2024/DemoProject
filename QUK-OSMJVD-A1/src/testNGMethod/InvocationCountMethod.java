package testNGMethod;

/* Here invocationCount means = no of times the test case runs/executes*/

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountMethod {
	@Test(invocationCount = 4,priority = 4)
	public void logout() {
		Reporter.log("user has logout",true);
	}
	@Test(invocationCount = 2,priority = 2)
	public void login() {
		Reporter.log("user has login",true);
	}
	@Test(invocationCount = 3,priority = 3)
	public void addCart() {
		Reporter.log("user has add to cart",true);
	}
	@Test(invocationCount = 5,priority = 1)
	public void register() {
		Reporter.log("user has registered",true);
	}

}
