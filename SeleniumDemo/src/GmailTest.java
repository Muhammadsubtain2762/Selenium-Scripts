import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		String path="C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\gecko\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("Subtainwazir@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		String at = driver.getTitle();
		String et = "gmail";
		Thread.sleep(4000);
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.print("Test is Successful");
		}
		else
		{
			System.out.print("Test Failure");
		}
		}

	}


