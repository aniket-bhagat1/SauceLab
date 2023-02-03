package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {

	@FindBy(xpath="//span[text()='Your Cart']") private WebElement yourCartLabel;
	@FindBy(id="remove-sauce-labs-backpack") private WebElement backpack;
	@FindBy(id ="checkout") private WebElement checkout;
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyYourCartLabel() {
		return yourCartLabel.isDisplayed();
	}
	public String verifyRemoveBackPack() {
		
		checkout.click();
	
		return driver.getCurrentUrl();
		
	}
}
