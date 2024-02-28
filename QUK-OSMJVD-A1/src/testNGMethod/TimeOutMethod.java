package testNGMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutMethod {
	@Test(timeOut = 3000)
	public void launch() {
		Reporter.log("TestNg");
	}

}
