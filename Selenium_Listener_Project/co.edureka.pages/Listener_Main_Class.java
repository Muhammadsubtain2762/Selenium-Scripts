import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Listener_Main_Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
		EventCapture eCapture = new EventCapture();
		
		//eventHandler.register((WebDriverEventListener) eCapture);
		eventHandler.navigate().to("https://www.edureka.co/blog/");
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		eventHandler.findElement(By.linkText("Software Testing")).click();
		eventHandler.navigate().to("https://www.edureka.co/all-courses/");
		
		eventHandler.navigate().back();
		//eventHandler.quit();
		
		//eventHandler.unregister((WebDriverEventListener) eCapture);
		System.out.println("End of Listener Class");
		
		
		
		
		
		
		

	}

}
