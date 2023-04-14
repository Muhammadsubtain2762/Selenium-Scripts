package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyLoginStepDefinitions {
	public WebDriver driver=null;
	@Given("Open the browser")
	public void open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		}

	@When("Enter the URL {string}")
	public void enter_the_url(String string) {
		driver.get("http://practice.automationtesting.in/");
	   
	}

	@And("Click on My Account Menu")
	public void click_on_my_account_menu() {
		WebElement Account = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
		Account.click();
		
	    
	}

	@And("Enter registered username and password")
	public void enter_registered_username_and_password() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Subtainwazir@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Wazir@2762");
	
	   
	}

	@And("Click on login button")
	public void click_on_login_button() {
		WebElement Login = driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-36']/div[1]/div[1]/div[1]/div[1]/form[1]/p[3]/input[3]"));
		Login.click();
	   
	}

	@Then("User must successfully login to the web page")
	public void user_must_successfully_login_to_the_web_page() {
		String CapText= driver.findElement(By.xpath("//strong[contains(text(),'subtainwazir')]")).getText();
		System.out.print(CapText);
		
	    
	}

}
