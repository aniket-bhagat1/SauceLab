package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class InventoryPage extends TestBase {

	@FindBy(xpath="//div[@class='peek']") private WebElement peekLogo;
	@FindBy(xpath="//span[text()='Products']") private WebElement prodLabel;
	@FindBy(xpath ="//img[@alt=\"Swag Bot Footer\"]") private WebElement swagBotLogo;
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement backPack;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement bikeLight;
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement tShirt;
	@FindBy(xpath = "//span[text()='3']") private WebElement cartValue;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartPage;

	
	
	public InventoryPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyPeekLogo() {
		return peekLogo.isDisplayed();
	}
	public boolean verifyProdLabel() {
		return  prodLabel.isDisplayed();
	}
	public boolean verifySwagBotLogo() {
		return swagBotLogo.isDisplayed();
	}
	public boolean verifyAddProducts() {
		backPack.click();
		bikeLight.click();
		tShirt.click();
		return cartValue.isDisplayed();
	}
	public String VerifyCartPage() {
		cartPage.click();
		return driver.getCurrentUrl();
	}
	
	
}
