package listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNgImplementation extends BaseClassIT implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result)
	{
		Reporter.log("TestCase execution started", true);
	}
	
	int i=1;
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TestCase execution failed", true);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./errorScreenShot/"+i+ "pic.png");
        try {
			FileHandler.copy(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        i++;	
		}
	
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TestCase execution passed", true);
	}

}
