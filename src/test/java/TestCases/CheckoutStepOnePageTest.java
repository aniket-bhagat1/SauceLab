package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutStepOnePage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckoutStepOnePageTest extends TestBase{

	LoginPage login;
	InventoryPage inventory;
	CartPage cart;
	CheckoutStepOnePage stepOne;
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		login = new LoginPage();
		inventory = new InventoryPage();
		cart = new CartPage();
		stepOne = new CheckoutStepOnePage();
		login.loginToApp();
		inventory.VerifyCartPage();
		cart.verifyRemoveBackPack();	
	}
	
	@Test
	public void verifyYourInfoLabelTest() {
		boolean actRes = stepOne.verifyYourInfoLabel();
		Assert.assertEquals(actRes, true);
	}
	@Test
	public void verifyAddInfoTest() {
		String actRes = stepOne.verifyAddInfo();
		String expRes = "https://www.saucedemo.com/checkout-step-two.html";
		Assert.assertEquals(actRes, expRes);
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
