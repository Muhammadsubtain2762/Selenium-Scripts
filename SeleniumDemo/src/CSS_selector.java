import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Samasubg Galaxy 22 ultra");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#gh-btn")).click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("span=[class\"='s-item__price']")).click();
		Thread.sleep(2000);
		//Relative X path starts-with function
		driver.findElement(By.xpath("//img[starts-with(@alt,'For Samsung S22 Ultra S21 S20 FE A53 A52s Cute Heart Plating Rubber Case Cover')]")).click();
		//driver.close();

	}

}
