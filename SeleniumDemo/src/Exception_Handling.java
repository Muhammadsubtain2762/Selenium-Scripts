import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_Handling {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		
		try{
		driver.findElement(By.name("fake")).click();
		
		}catch (Exception e) {
			
			System.out.println("Element not found");
			System.out.println("Hello");
			
			throw(e);
		}
		
		System.out.println("Hello");

	}

}
