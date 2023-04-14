package co.edureka.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	ChromeDriver driver;
	//This will take data from dataprovider which we have created
		@Test(dataProvider="testData")
		public void DemoProject(String username, String password) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/newtours/");
			
			driver.findElement(By.id("userName")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("login")).click();
			Thread.sleep(5000);
			Assert.assertTrue("Invalid credentials", driver.getTitle().matches("Find a Flight: Mercury Tours:"));
			System.out.println("Login Successfull");
			}	
		@AfterMethod
		void ProgramTermination() {
			driver.quit();
		}
		
		@DataProvider(name="testData")
		public Object[][] TestDataFeed()
		{
			
			ReadExcelFile config = new ReadExcelFile("C:\\Users\\Muhammad Sabtain\\Desktop\\TestData.xlsx");
			int rows = config.getRowCount(0);
					
			//create object array with 2 rows and 2 columns- first parameter is row and second is coloumn
			Object[][] credentials= new Object[rows][2];
			for(int i=0; i<rows;i++) {
				credentials[i][0]= config.getData(0,i,0);
				credentials[i][1]= config.getData(0,i,1);
			}
			return credentials;
			

}
}
