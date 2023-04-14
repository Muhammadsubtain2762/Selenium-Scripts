package SeleniumYouTubeDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumYouTubeDemo {
	@Test
	public void JenkinsTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Hi, Welcome to Edureka's YouTube Live Session on Selenium Webdriver");
		driver.navigate().to("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nike shoes");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println("Page title is :" +title);
		
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("subtainwazir@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("subtain@2762");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
		
	}

}
