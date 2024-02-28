package testNGMethod;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethod {
	
	@DataProvider(name = "testData")
	public String[][]getData(){
		String[][] data = new String[2][5];
		data[0][0] = "Akansha";
		data[0][1] = "UK";
		data[0][2] = "2345672834";
		data[0][3] = "A+";
		data[0][4] = "akansha2022@gmail.com";
		
		data[1][0] = "Bindu";
		data[1][1] = "UK";
		data[1][2] = "987672834";
		data[1][3] = "O+";
		data[1][4] = "bindu2022@gmail.com";
		return data;
				}
	@DataProvider(name = "testData1")
	public String[][]getData1(){
		String[][] data = new String[2][5];
		data[0][0] = "Rekha";
		data[0][1] = "India";
		data[0][2] = "238772834";
		data[0][3] = "B+";
		data[0][4] = "rekha@gmail.com";
		
		data[1][0] = "Sharmila";
		data[1][1] = "UK";
		data[1][2] = "9886672834";
		data[1][3] = "O+";
		data[1][4] = "sharmila@gmail.com";
		return data;
	}
	
	
   @Test(dataProvider = "testData1")
   public void demo(String name,String state,String number,String bloodgroup,String gmail) {
	   Reporter.log(name,true);
	   Reporter.log(state,true);
	   Reporter.log(number,true);
	   Reporter.log(bloodgroup,true);
	   Reporter.log(gmail,true);
	  
	   
   }
}
