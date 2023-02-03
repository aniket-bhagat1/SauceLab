package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckoutStepTwoPage extends TestBase {

	@FindBy(xpath="//span[text()='Checkout: Overview']") private WebElement overview;
	@FindBy(id="checkout_summary_container") private WebElement cartList;
	@FindBy(id="finish") private WebElement finish;
	public CheckoutStepTwoPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyOverviewLabel() {
		return overview.isDisplayed();
	}
	public String verifyCartList() {
		return cartList.getText();
	}
	public String verifyFinish() {
		finish.click();
		return driver.getCurrentUrl();
	}
	 
	
}
