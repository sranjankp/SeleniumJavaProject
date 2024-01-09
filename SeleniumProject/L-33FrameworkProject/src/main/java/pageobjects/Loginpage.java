package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement password;

	@FindBy(xpath="//input[@value='Login']")
	WebElement submit;
	
	public WebElement Emailb()
	{
		return email;
	}
	
	public WebElement Passwordb()
	{
		return password;
	}
	
	public WebElement Submitb()
	{
		return submit;
	}


}
