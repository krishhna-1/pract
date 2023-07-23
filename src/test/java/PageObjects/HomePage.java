package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	//constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//elements
	
	@FindBy(xpath="//span[text()='My Account']") WebElement linkMyAccount;
	
	@FindBy(xpath="//input[@class='form-control form-control-lg']")
	WebElement ipboxSearchBar;
	
	@FindBy(linkText ="Register") WebElement lnkRegister;
	
	@FindBy(linkText = "Login") WebElement lnkLogin;
	
	//action methods
	
	public void clickMyAccount()
	{
		linkMyAccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
}
