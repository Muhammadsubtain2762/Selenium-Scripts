package Testingpages;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pages {
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")


		
		
	public void setup(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("https://www.ff.com.pk/");
			}
		
		else {
			throw new Exception("browser is not correct");
			}
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}	

	@Test
			
	public void FFgoogleXML() throws InterruptedException{
		
		System.out.println("Testing of forms by passing Values");
		
		
		WebElement OnlineOrder = driver.findElement(By.xpath("//body/div[2]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/div[1]/img[1]"));
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
		
		 driver.navigate().to("https://www.ff.com.pk/");   
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
		
		driver.navigate().to("https://www.ff.com.pk/");
		
		
		WebElement Freecons = driver.findElement(By.xpath("//body/div[2]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/a[1]/div[1]/img[1]"));
		Freecons.click();
		Thread.sleep(4000);
		
		
		driver.navigate().to("https://www.ff.com.pk/");
		
		WebElement contactnum = driver.findElement(By.xpath("//body/div[2]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/a[1]/div[1]/img[1]"));
		contactnum.click();
		Thread.sleep(4000);
		
		 System.out.println("First Test is Sucessfull .........");
		
		
		
		
		

}
	@Test
	
	public void ProductLinksWithXML() throws InterruptedException{
		
		
		 System.out.println("Testing Links of Products in Menu");
		 driver.navigate().to("https://www.ff.com.pk//grade80");   
		 Thread.sleep(4000);
		 
		 driver.navigate().to("https://www.ff.com.pk/grade60");   
		 Thread.sleep(4000);
		 
		 driver.navigate().to("https://www.ff.com.pk/defromed/steel/bars");   
		 Thread.sleep(4000);
		 
		 
		 driver.navigate().to("https://ff.com.pk/");
		 System.out.println("Second Test is Sucessfull ..........");
		 
		 
}
	
    @Test
	
	public void ProfileLinksWithXML() throws InterruptedException{
		
    	
		 System.out.println("Testing Links of Profile in Menu");
		 driver.navigate().to("https://www.ff.com.pk/corporate/history");   
		 Thread.sleep(4000);
		 
		 driver.navigate().to("https://www.ff.com.pk/our/team");   
		 Thread.sleep(4000);
		 		 
		 driver.navigate().to("https://ff.com.pk/");
		 System.out.println("Third Test is Sucessfull ..........");
		 
}
    @Test
	
	public void CareersLinksWithXML() throws InterruptedException{
		
    	
		 System.out.println("Testing Career Module in Menu");
		 driver.navigate().to("https://www.ff.com.pk/career/opening");   
		 Thread.sleep(4000);
		 
		 WebElement Post = driver.findElement(By.xpath("//h3[contains(text(),'test')]"));
		 Post.click();
		 Thread.sleep(4000);
		 
		 WebElement Applyhere = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/form[1]/input[2]"));
		 Applyhere.click();
		 Thread.sleep(4000);
		 
	
		 		 
		 driver.navigate().to("https://ff.com.pk/");
		 System.out.println("4th Test is Sucessfull ..........");
		 
}
	
	
	@AfterTest
	
	
	public void quit() {
		driver.close();
	}
	
	

}
