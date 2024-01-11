package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 public class LoginPage {
	 WebDriver d;
  public LoginPage(WebDriver d)
  {//this d =WebDriver d;
	  //d=(WebDriver d)
	  this.d=d;
  }
	
private	By email=By.id("input-email");
private	By password=By.id("input-password");
private	By login=By.xpath("//input[@value='Login']");

public WebElement email()
{
	return d.findElement(email); 
}

public WebElement password ()
{
	return d.findElement(password);
}

public WebElement login()
{
	return d.findElement(login);
}

}
