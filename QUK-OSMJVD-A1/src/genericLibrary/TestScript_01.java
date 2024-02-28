package genericLibrary;

import org.testng.annotations.Test;

public class TestScript_01 extends BaseClass {
	
	@Test
	public void demo() throws InterruptedException
	{
		HomePage_Pom hp = new HomePage_Pom(driver);
		//hp.getRegisterButton().click();
		hp.getSearchBox().sendKeys("books");
		hp.getComputersButton().click();
		Thread.sleep(4000);
	}

}
