package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver d;
	 public LoginPage(WebDriver d)
	  {
		 PageFactory.initElements(d,this);
	  }
		
		@FindBy(id="input-email")
		WebElement email;
		@FindBy(id="input-password")
		WebElement password;
		@FindBy(xpath="//input[@value='Login']")
		WebElement login;
	public WebElement email()
	{
		return email;
	}

	public WebElement password ()
	{
		return password;
	}

	public WebElement login()
	{
		return login;
	}

	}

