package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	WebDriver d;
	 public MyAccountPage(WebDriver d)
	  {
		  
		 PageFactory.initElements(d,this);
	  }
	 @FindBy(xpath="//a[normalize-space()='Account']")
	WebElement account;
	 public WebElement MyAccountPage()
	 {
		return account; 
	 }


}
