import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.intl=in");
		
		//driver.findElement(By.cssSelector("#login-username")).sendKeys("subtainwazir@yahoo.com"); //CSS selector
		////Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("subtainwazir@yahoo.com");// X path 
		////Thread.sleep(5000);
		//driver.findElement(By.partialLinkText("Forgotten")).click(); //Partial Link Text
		//Thread.sleep(5000);
		driver.findElement(By.linkText("Create an account")).click(); //Link text 
		//Thread.sleep(2000);
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Muhammad"); //id 
		//Thread.sleep(2000);
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Subtain");
		//Thread.sleep(2000);
		driver.findElement(By.id("usernamereg-userId")).sendKeys("muhammad_subtain");
		//Thread.sleep(2000);
		driver.findElement(By.id("usernamereg-password")).sendKeys("Frontier@2547");
		//Thread.sleep(2000);
		driver.findElement(By.id("usernamereg-birthYear")).sendKeys("1998");
		//Thread.sleep(2000);
		driver.findElement(By.id("reg-submit-button")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("shortCountryCode")).sendKeys("Pakistan (+92)"); //By Name
		//Thread.sleep(2000);
		driver.findElement(By.id("usernamereg-phone")).sendKeys("3353132771");
		//Thread.sleep(2000);
		driver.findElement(By.id("reg-submit-button")).click();
		//Thread.sleep(4000);
		driver.findElement(By.id("recaptcha-anchor")).click();
		//Thread.sleep(4000);
		driver.findElement(By.id("recaptcha-submit")).click();
		driver.close();
		
		

	}

}