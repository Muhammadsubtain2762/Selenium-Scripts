import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	public String baseUrl = "https://www.edureka.co/";
	String driverPath = "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe";
	public WebDriver driver ;
	
	
	@BeforeTest
	
	public void LaunchBrowser () {
		System.out.println("Launching google Chrome");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	
      @Test 
	
	public void verifyHomePageTitle () {
		String expectedTitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
		
      }
      
      @AfterTest 
  	
  	public void TerminateBrowser () {
  		driver.close();

}
}
