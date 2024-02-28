package testNGMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P1 {
	@Test(dependsOnMethods="register")
	public void login() {
		Reporter.log("Logged in" , true);
	}
	
	@Test(dependsOnMethods="login")
	public void addToCart() {
		Reporter.log("Added to cart" , true);
	}

	@Test(dependsOnMethods="addToCart")
	public void logout() {
		Reporter.log("Logged out" ,true);
	}
	
	@Test
	public void register() {
		Reporter.log("User Registered", true);
	}




}
