package stepdiffinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
//	import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver d;
	@Before()
	public void setup()
	{
		 System.out.println("Ninja");
		d= new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	 @Given("^User navigates to login page of the application$")
	    public void user_navigates_to_login_page_of_the_application()  {
		 
		 d.get("http://tutorialsninja.com/demo/index.php?route=account/login");  
	    }

	    @When("^User enters Username as \"(.*)\" and Password as \"(.*)\" into the fields$")
	    public void user_enters_username_as_something_and_password_as_something_into_the_fields(String email, String pass) throws InterruptedException  {
	     d.findElement(By.id("input-email")).sendKeys(email);
	     d.findElement(By.id("input-password")).sendKeys(pass);
	     Thread.sleep(3000);
	    	
	    }
	    

	    @And("^Clicks on the Login button$")
	    public void clicks_on_the_login_button()  {
	    	d.findElement(By.xpath("//input[@value='Login']")).click();
	       
	    }


	    @Then("^User should successfully login$")
	    public void user_should_successfully_login() {
	    WebElement account = null;
	    try
	    {
	    account =d.findElement(By.xpath("//a[normalize-space()='Account']"));
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Login has failed");
	    }
	    // for junit
	   Assert.assertNotNull("Login has failed", account);
	    //for testng
	 //  Assert.fail();
	    
	    }
	    
	    @After("@ninja")
	    public void closebrowsers() throws InterruptedException
	    {
	    	Thread.sleep(4000);
	    	 d.quit();;
	    }

	}
	
