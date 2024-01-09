package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Accountpage;
import pageobjects.LandingPage;
import pageobjects.Loginpage;
import resources.Base;

public class LoginTest extends Base {
	WebDriver driver;
	@Test(dataProvider="getdata")
	public void login(String emails,String passwords,String expectedstatus) throws IOException, InterruptedException
	{
		
		LandingPage land= new LandingPage(driver);
		land.myaccounts().click();
		land.logins().click();
		Loginpage log = new Loginpage(driver);
		log.Emailb().sendKeys(emails);
		log.Passwordb().sendKeys(passwords);
		Thread.sleep(3000);
		log.Submitb().click();
		Accountpage acc= new Accountpage(driver);
		String actualresult = null;
		try
		{
			if(acc.accounting().isDisplayed()){
			actualresult="success";
			}
		}
		
		catch(Exception e)
		{
			actualresult="fail";	
		}
		
		Assert.assertEquals(actualresult, expectedstatus);	
		
	}
	
	@DataProvider()
	public Object[][] getdata()
	{
		Object[][] data= {{"arun.selenium@gmail.com","Second@123","success"},{"shashi@gmail.com","prince","fail"}};
		return data;
	}
	
	@BeforeMethod
	public void openbrowser() throws Exception
	{
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
	}
	
	  @AfterMethod
      public void closer()
      {
    	  driver.close();
      }
}
