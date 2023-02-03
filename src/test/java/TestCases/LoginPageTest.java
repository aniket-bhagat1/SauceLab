package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage login;
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception {
		initialization();
		login = new LoginPage();
	}
	
	@Test (enabled = true, groups = "sanity")
	public void verifyLoginPageLinkTest() {
		String actRes = login.verifyLoginPageLink();
		String expRes = "https://www.saucedemo.com/";
		Assert.assertEquals(actRes, expRes);
	}
	@Test
	public void verifyBotLogoTest() {
		boolean actRes = login.verifyBotLogo();
		Assert.assertEquals(actRes, true);
	}
	
	@Test
	public void loginToAppTest() throws Exception {
		String actRes = login.loginToApp();
		String expRes = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actRes, expRes);
	}
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowser() {
		driver.close();
	}
	
}
