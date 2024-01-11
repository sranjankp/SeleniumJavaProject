package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	WebDriver d;
	 public MyAccountPage(WebDriver d)
	  {
		  this.d=d;
	  }
	private By account=By.xpath("//a[normalize-space()='Account']");
	 public WebElement MyAccountPage()
	 {
		return d.findElement(account); 
	 }

}
