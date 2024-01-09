package ppack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import objectrepository.LoginPage;
import objectrepository.MyAccountPage;

public class LoginTest {
	WebDriver d;
	@Test
	public void log() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    d= new ChromeDriver(co);
		d.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage loginpage = new LoginPage(d);
		loginpage.email().sendKeys("arun.selenium@gmail.com");
		loginpage.password().sendKeys("Second@123"); 
		loginpage.login().click();
		MyAccountPage mpage=new MyAccountPage(d);
		Assert.assertTrue(mpage.MyAccountPage().isDisplayed());	
		Thread.sleep(3000);
	} 
	@AfterMethod
        public void closer()
       {
    	   d.quit();
       }
}
