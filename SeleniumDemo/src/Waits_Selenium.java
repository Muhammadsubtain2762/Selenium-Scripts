import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("subtainwazir@gmail.com");
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		//driver.close();
		WebElement firstname=driver.findElement(By.name("firstname"));
		WebElement lastname=driver.findElement(By.name("lastname"));
		
		//sendKeys(driver,firstname,10,"edureka");
		//sendKeys(driver,lastname,10,"edureka");
		//WebElement forgotAccount=driver.findElement(By.linkText("Forgotten account?"));
		//clickOn(driver,forgotAccount,10);
		


	}
	//public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value)
	{
		//new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
		//element.sendKeys(value);
	}
	//public static void clickOn(WebDriver driver1, WebElement element, int timeout)
	{
		//new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		//element.click();
	}
	
	

}
