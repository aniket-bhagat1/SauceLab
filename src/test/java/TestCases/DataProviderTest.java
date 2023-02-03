package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://is.rediff.com/signup/register");
	}
	@DataProvider
	public void getTestData() {
		
	}
	
	
	@Test
	public void verifyDataProviderTest(String fullName, String emailID, String pass, String repass) {
		driver.findElement(By.id("fullname")).clear();
		driver.findElement(By.id("fullname")).sendKeys(fullName);
		
		driver.findElement(By.id("emailid")).clear();
		driver.findElement(By.id("emailid")).sendKeys(emailID);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		driver.findElement(By.id("repass")).clear();
		driver.findElement(By.id("repass")).sendKeys(repass);
		
//		driver.findElement(By.xpath("")).clear();
//		driver.findElement(By.xpath("")).sendKeys("");
//		
//		driver.findElement(By.xpath("")).clear();
//		driver.findElement(By.xpath("")).sendKeys("");
		
		
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
