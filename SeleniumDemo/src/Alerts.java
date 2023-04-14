import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("alert")).click();
		Thread.sleep(3000);
		Alert alert = driver .switchTo().alert();
		String alertMessage = driver .switchTo() .alert() .getText(); //print alert message on Screen 
		System.out.println(alertMessage);
		Thread.sleep(3000);
		alert.accept(); // Accept alert 
		Thread.sleep(3000);
		driver.findElement(By.id("PopUp")).click();  //Automate Pop up menu
		Robot robot = new Robot();
		robot.mouseMove(400, 5);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(3000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(3000);
		//driver.quit();
		
		
		

	}

}
