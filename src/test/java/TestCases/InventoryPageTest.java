package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase{
	LoginPage login;
	InventoryPage Inventory;
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		login = new LoginPage();
		Inventory = new InventoryPage();
		login.loginToApp();
	}
	@Test (enabled = true, groups = "sanity")
	public void verifyPeekLogoTest() {
		boolean actRes = Inventory.verifyPeekLogo();
		Assert.assertEquals(actRes, true);
	}
	@Test
	public void verifyProdLabelTest() {
		boolean actRes = Inventory.verifyProdLabel();
		Assert.assertEquals(actRes, true);
		
	}
	@Test
	public void verifySwagBotLogoTest() {
		boolean actRes = Inventory.verifySwagBotLogo();
		Assert.assertEquals(actRes, true);
	}
	@Test
	public void verifyAddProductsTest() {
		boolean actRes = Inventory.verifyAddProducts();
		Assert.assertEquals(actRes, true);
	}
	@Test
	public void VerifyCartPageTest() {
		String actRes = Inventory.VerifyCartPage();
		String expRes = "https://www.saucedemo.com/cart.html";
		Assert.assertEquals(actRes, expRes);
	}
	
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
