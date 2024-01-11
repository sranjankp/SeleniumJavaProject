package stepdiffinition;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Omayo {
	
	WebDriver d;
	@Before("@login")
	public void setup()
	{
		//  WebDriverManager.chromedriver().setup();
		  ChromeOptions co= new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		d= new ChromeDriver(co);
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@Given("^I navigate to application URL$")
	public void I_navigate_to_application_URL() { 
		d.get("http://omayo.blogspot.com/");
		}
	
	@When("^I enter Username as \"([^\"]*)\" and password as \"([^\"]*)\" into the field$")
     public void  I_enter_Username_as_someusername_and_password_as_somepassword_into_the_field(String username, String password) {
    	d.findElement(By.name("userid")).sendKeys(username);
    	d.findElement(By.name("pswrd")).sendKeys(password);
     }

    @And("^I click on login button$")
    public void i_click_on_login_button()  {
       d.findElement(By.xpath("//input[@value='Login']")).click();
    }
    
    @Then("^User should be able to login based on \"([^\"]*)\" login status$")
    public void user_should_be_able_to_login_based_on_something_login_status(String expected)  {
    	 String actualresult=null;
    	 try {
    Alert a = d.switchTo().alert();
   
    if(a.getText().contains("Error Password or Username"));
    {
    	actualresult="failure";
    }}
    	 catch(Exception e)
    	 {
    		 actualresult="success"; 
    	 }
      Assert.assertEquals( expected, actualresult); 
     
    }
    @After("@login")
    public void teardown()
    {
    	 d.quit();;
    }
      
    }



