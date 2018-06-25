package dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderEx {
	@Test(dataProvider = "dp")
	public void getData(String firstname, String lastname)
	{
		System.out.println(firstname);
		System.out.println(lastname);
	}
	@DataProvider
	public Object[][] dp() {
		Object[][] data = new Object[3][2];
		// 3- number of rows tells how many times the code will execute
		//2- number of columns tells the number of parameters

		data[0][0] ="Dolly";
		data[0][1] ="Gandhi";
		data[1][0] ="Anchit";
		data[1][1] ="Narang";
		data[2][0] ="Lalit";
		data[2][1] ="Gandhi";
		return data;
	}
}

