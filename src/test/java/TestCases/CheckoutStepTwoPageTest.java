package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutStepOnePage;
import Pages.CheckoutStepTwoPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckoutStepTwoPageTest extends TestBase {

	LoginPage login;
	InventoryPage inventory;
	CartPage cart;
	CheckoutStepOnePage stepOne;
	CheckoutStepTwoPage stepTwo;
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		login = new LoginPage();
		inventory = new InventoryPage();
		cart = new CartPage();
		stepOne = new CheckoutStepOnePage();
		stepTwo = new CheckoutStepTwoPage();
		login.loginToApp();
		inventory.VerifyCartPage();
		cart.verifyRemoveBackPack();
		stepOne.verifyAddInfo();
	}
	@Test
	public void verifyOverviewLabelTest() {
		boolean actRes = stepTwo.verifyOverviewLabel();
		Assert.assertEquals(actRes, true);
	}
	@Test
	public void verifyCartListTest() {
		String context = stepTwo.verifyCartList();
		System.out.println(context);
	}
	@Test
	public void verifyFinishTest() {
		String actRes = stepTwo.verifyFinish();
		String expRes = "https://www.saucedemo.com/checkout-complete.html";
		Assert.assertEquals(actRes, expRes);
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
