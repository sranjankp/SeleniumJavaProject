package ppack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import objectrepository.LoginPage;
import objectrepository.MyAccountPage;

public class LoginTest {
	WebDriver d;
	@Test
	public void log()
	{
		WebDriverManager.chromedriver().setup();
	    d= new ChromeDriver();
		d.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage loginpage = new LoginPage(d);
		loginpage.email().sendKeys("arun.selenium@gmail.com");
		loginpage.password().sendKeys("Second@123"); 
		loginpage.login().click();
		MyAccountPage mpage=new MyAccountPage(d);
		Assert.assertTrue(mpage.MyAccountPage().isDisplayed());	
	} 
	@AfterMethod
        public void closer()
       {
    	   d.quit();
       }
}


