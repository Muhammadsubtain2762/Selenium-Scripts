import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Note 20 ultra");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("SAMSUNG")).click();
		//driver.navigate().to("https://www.ff.com.pk");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//img[contains(@src,'71U1rKhe39L._AC_UL320_')]")).click(); // X path by using contains function
		//driver.navigate().back();
		//driver.quit();
		
		
		
		

	}

}
