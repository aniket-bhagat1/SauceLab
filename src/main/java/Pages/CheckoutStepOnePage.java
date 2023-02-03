package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckoutStepOnePage extends TestBase {

	@FindBy(xpath = "//span[text()='Checkout: Your Information']") private WebElement yourInfoLabel;
	@FindBy(id = "first-name") private WebElement firstName;
	@FindBy(id = "last-name") private WebElement lastName;
	@FindBy(id = "postal-code") private WebElement postalCode;
	@FindBy(id = "continue") private WebElement continueBtn;
	
	public CheckoutStepOnePage() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyYourInfoLabel() {
		return yourInfoLabel.isDisplayed();
	}
	public String verifyAddInfo() {
		firstName.sendKeys("abcdefgh");
		lastName.sendKeys("pqrstuvwxyz");
		postalCode.sendKeys("1234567");
		continueBtn.click();
		return driver.getCurrentUrl();
	}
}
