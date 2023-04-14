package co.edureka.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class CrossBrowserScript {

	WebDriver driver;
	
@BeforeTest
@Parameters("browser")


	
	
public void setup(String browser) throws Exception {
	if(browser.equalsIgnoreCase("firefox")) {
		String path="C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\gecko\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
			
			
		}
		
	else if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	else if (browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Edge\\msedgedriver.exe");
		driver = new EdgeDriver();
		}
	else {
		throw new Exception("browser is not correct");
		}
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	

@Test
		
public void testParameterWithXML() throws InterruptedException{
	driver.get("https://www.edureka.co/");
	
	WebElement Login = driver.findElement(By.xpath("//header/nav[1]/ul[1]/li[4]/span[1]"));
	Login.click();
	Thread.sleep(4000);

	WebElement userName = driver.findElement(By.id("si_popup_email"));
	userName.sendKeys("subtainwazir@gmail.com");
		
	WebElement Password = driver.findElement(By.id("si_popup_passwd"));
	Password.sendKeys("123456");
	Thread.sleep(4000);
		
	WebElement Next = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	Next.click();
	Thread.sleep(4000);
		
	WebElement Search = driver.findElement(By.xpath("//input[@id='search-input']" ));
	Search.sendKeys("Selenium Certification Training Course");
	Thread.sleep(6000);
		
	WebElement Searchbtn = driver.findElement(By.id("search-box" ));
	Searchbtn.click();
	Thread.sleep(4000);
		
		
		
		
		
		
	}
}
	
	