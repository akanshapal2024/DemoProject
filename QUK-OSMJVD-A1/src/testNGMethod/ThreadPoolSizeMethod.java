package testNGMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThreadPoolSizeMethod {
	@Test(invocationCount = 1, threadPoolSize = 2)
	public void login() {
		Reporter.log("user has login", true);
	}
	@Test(invocationCount = 2, threadPoolSize = 1)
	public void addCart() {
		Reporter.log("user has added the product", true);
	}
	@Test(invocationCount = 2, threadPoolSize = 2)
	public void logout() {
		Reporter.log("user has logout", true);
	}
	
	
	

}
