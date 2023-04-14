package co.edureka.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import co.edureka.pages.FbHomePage;
import co.edureka.pages.FbLoginPage;

public class FbLoginTest extends TestBase {
	
	@Test
	public void init() throws Exception{
		driver.get("https://www.facebook.com");
		
		FbLoginPage loginpage = PageFactory.initElements(driver, FbLoginPage.class);
		loginpage.setEmail("subtainwazir@gmail.com");
		loginpage.setPassword("@hgy7tuiui2");
		loginpage.clickOnLoginButton();
		Thread.sleep(5000);
		
		FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
		Thread.sleep(4000);
		homepage.clickOnProfileDropdown();
		Thread.sleep(4000);
		homepage.clickOnLogoutLink();
	}
}