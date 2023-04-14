package co.edureka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbHomePage {
	WebDriver driver;
	
	public FbHomePage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	@FindBy(how=How.ID, using="jsc_c_d") WebElement profileDropdown;
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Log Out')]") WebElement logoutLink;
	//@FindBy(how=How.XPATH, using="//div[text()='Account Setting']") WebElement profileDropDown;
	
	
	
	public void clickOnProfileDropdown() {
		profileDropdown.click();
		
	}
	
	public void clickOnLogoutLink() {
		logoutLink.click();
		
	}
	
}