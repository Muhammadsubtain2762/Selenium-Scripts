package ff.com.pk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Test
public class GoogleTesting {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")


		
		
	public void setup(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		
		else {
			throw new Exception("browser is not correct");
			}
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}	

	@Test
			
	public void testgoogleXML() throws InterruptedException{
		driver.get("https://ff.com.pk/");
		
		
	
		
		WebElement OnlineOrder = driver.findElement(By.xpath("//body/div[2]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/div[1]"));
		OnlineOrder.click();
		Thread.sleep(4000);

		WebElement mble = driver.findElement(By.id("numbermob"));
		mble.sendKeys("0335 3132771");
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		WebElement Ordernum = driver.findElement(By.xpath("//body/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]"));
		Ordernum.sendKeys("123456");
		Thread.sleep(4000);
			
		WebElement SubmitReq = driver.findElement(By.id("SS_U_phoneno_submit"));
		SubmitReq.click();
		Thread.sleep(4000);
			
		WebElement IBFT = driver.findElement(By.xpath("//a[contains(text(),'click here for payment procedure')]" ));
		IBFT.click();
		Thread.sleep(4000);
		
		driver.navigate().back(); 
		Thread.sleep(4000);
		
		 driver.navigate().to("https://ff.com.pk/ff-staging/");   
		Thread.sleep(4000);
		
		WebElement ConcingmentTracking = driver.findElement(By.xpath("//body/div[2]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/a[1]/div[1]/img[1]"));
		ConcingmentTracking.click();
		Thread.sleep(4000);
		
		WebElement Diliverynum = driver.findElement(By.xpath("//body/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]"));
		Diliverynum.sendKeys("12345");
		Thread.sleep(4000);
		
		WebElement sub = driver.findElement(By.xpath("//body/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]"));
		sub.click();
		Thread.sleep(4000);
		
		driver.navigate().to("https://ff.com.pk/ff-staging/");
		
		
		WebElement Freecons = driver.findElement(By.xpath("//body/div[2]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/a[1]/div[1]/img[1]"));
		Freecons.click();
		Thread.sleep(4000);
		
		
		driver.navigate().to("https://ff.com.pk/ff-staging/");
		
		WebElement contactnum = driver.findElement(By.xpath("//body/div[2]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/a[1]/div[1]/img[1]"));
		contactnum.click();
		Thread.sleep(4000);
		
		
		
		
		

}
}
