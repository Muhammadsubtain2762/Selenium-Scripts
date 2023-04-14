package co.edureka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbLoginPage {
	WebDriver driver;
	
	public FbLoginPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='email']") WebElement emailTextBox;
	@FindBy(how=How.ID, using="pass") WebElement passwordTextBox;
	@FindBy(how=How.XPATH, using="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]") WebElement signinButton;
	//@FindBy(how=How.XPATH, using="//div[text()='Account Setting']") WebElement profileDropDown;
	
	
	
	public void setEmail(String strEmail) {
		emailTextBox.sendKeys(strEmail);
		
	}
	
	public void setPassword(String strPassword ) {
		passwordTextBox.sendKeys(strPassword);
		
	}
	
	public void clickOnLoginButton() {
		signinButton.click();
	}


}
