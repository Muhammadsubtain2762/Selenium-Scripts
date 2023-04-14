package co.edureka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement SourceElement = driver.findElement(By.id("draggable"));
		WebElement TargetElement = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		//action.dragAndDrop(SourceElement, TargetElement).build().perform();
		action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
		Thread.sleep(3000);
		//driver.quit();

	}

}
