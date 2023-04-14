
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SeleniumDemo {


			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http:www.facebook.com");
				driver.manage().window().maximize();
				
				WebElement days = driver.findElement(By.id("day"));
				Select oSelect = new Select(days);
				Thread.sleep(3000);
				oSelect.selectByIndex(6);
				WebElement month_m = driver.findElement(By.id("month"));
				Select month_m1 = new Select(month_m);
				Thread.sleep(3000);
				month_m1.selectByVisibleText("jul");
				WebElement year_y = driver.findElement(By.id("year"));
				Select year_y1 = new Select(year_y);
				Thread.sleep(3000);
				year_y1.selectByValue("2000");
				
				
				
			}

		


	}


