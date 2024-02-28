package testNGMethod;

/* Here priority can start from (1,2,3---) or (-1,0,1,2,3----) */

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityMethod {
	@Test(priority = 2)//(priority = 4)
	public void logout() {
		Reporter.log("user has log out the application", true);
	}
	@Test(priority = -1)//(priority = 1)
	public void register() {
		Reporter.log("user has registered", true);
	}
	@Test(priority = 0)//(priority = 2)
	public void login() {
		Reporter.log("user has login the application", true);
	}
	@Test(priority = 1)//(priority = 3)
	public void addToCart() {
		Reporter.log("user has added to the cart", true);
	}

}
