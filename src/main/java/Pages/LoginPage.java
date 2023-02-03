package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(id = "user-name") private WebElement username;
	@FindBy(id = "password") private WebElement password;
	@FindBy(id = "login-button") private WebElement loginBtn;


	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLoginPageLink() {
		return driver.getCurrentUrl();
	}
	public boolean verifyBotLogo() {
		return botLogo.isDisplayed();
	}
	public String loginToApp() throws Exception {
		username.sendKeys(ReadData.readPropertyFile("username"));
		password.sendKeys(ReadData.readPropertyFile("password"));
		loginBtn.click();
		return driver.getCurrentUrl();
	}
}
