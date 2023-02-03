package TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CartPageTest extends TestBase{

	LoginPage login;
	InventoryPage inventory;
	CartPage cart;
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		login = new LoginPage();
		inventory = new InventoryPage();
		cart = new CartPage();
		login.loginToApp();
		inventory.VerifyCartPage();
	}
	@Test
	public void verifyYourCartLabelTest() {
		boolean actRes = cart.verifyYourCartLabel();
		Assert.assertEquals(actRes, true);
	}
	@Test
	public void verifyRemoveBackPackTest() {
		String actRes = cart.verifyRemoveBackPack();
		String expRes = "https://www.saucedemo.com/checkout-step-one.html";
		Assert.assertEquals(actRes, expRes);
		
	}
	
	
	@AfterMethod
	public void closeMethod() {
		driver.close();
	}
}
