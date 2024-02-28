package testNGMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledMethod {
	@Test(priority = 1)
	public void login()
	{
		Reporter.log("user login", true);
	}
	
	@Test(enabled = true, priority = 2)
	public void addCart()
	{
		Reporter.log("user had added the product into cart", true);
	}
	
	@Test(enabled = true, priority = 3)
	public void logout()
	{
		Reporter.log("user logout", true);
	}

}
