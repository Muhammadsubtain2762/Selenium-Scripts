package co.edureka.pages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	@Test(dataProvider="getData")
	public void setData(String username, String password)
	{
		System.out.println("Your username is ::"+username);
		System.out.println("Your password is ::"+password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]= "user1";
		data[0][1]= "abcdef";
		
		data[1][0]= "user2";
		data[1][1]= "xyz";
		
		data[2][0]= "user3";
		data[2][1]= "123asd";
		
		return data;
	}

}
