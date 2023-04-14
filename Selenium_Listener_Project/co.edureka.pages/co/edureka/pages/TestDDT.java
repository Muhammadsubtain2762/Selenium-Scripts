package co.edureka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDDT {
	//This will take data from dataprovider which we have created
	@Test(dataProvider="testData")
	public void TestFireFox(String username, String password)
	{
		String path="C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\gecko\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("sbtainwazir@gmail.com");
		}
	//This is DataProvider which actually feeds data to our test cases here I have taken 2D array
	@DataProvider(name="testData")
	public Object[][] TestDataFeed()
	{
		//create object array with 2 rows and 2 columns- first parameter is row and second is coloumn
		Object[][] facebookdata= new Object[2][2];
		
		facebookdata[0][0]= "subtain@gmail.com";
		facebookdata[0][1]= "abcdef";
		
		
		facebookdata[1][0]= "usama@gmail.com";
		facebookdata[1][1]= "abcdef";
		
	
		
		return facebookdata;
		
		
	}
	
}