package stepdiffinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Register {
	WebDriver d;
	@Before("@register")
	public void openbrowser()
	{
	//WebDriverManager.chromedriver().setup();
	  ChromeOptions co= new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	d= new ChromeDriver(co);
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
    @Given("^I navigates to Registration page$")
    public void I_navigates_to_Registration_page()
    {
     d.get("http://tutorialsninja.com/demo/index.php?route=account/register");
    }
    
    @When("^I enter the below details$")
    public void I_enter_the_below_details(DataTable data)
    {
     Map<String, String> datamap = data.asMap(String.class, String.class)	;
     d.findElement(By.id("input-firstname")).sendKeys(datamap.get("firstName"));
     d.findElement(By.id("input-lastname")).sendKeys(datamap.get("lastName"));
     d.findElement(By.id("input-email")).sendKeys(datamap.get("email"));
     d.findElement(By.id("input-telephone")).sendKeys(datamap.get("Telephone"));
     d.findElement(By.id("input-password")).sendKeys(datamap.get("password"));
     d.findElement(By.id("input-confirm")).sendKeys(datamap.get("password"));
    }
   
    @And("^I selects the privacy policy option$")
    public void I_selects_the_privacy_policy_option()
    {
    d.findElement(By.name("agree")).click();	
    }
    	
      @And("^I clicks on Continue button$")
   public void I_clicks_on_Continue_button() throws InterruptedException
   {
    	  Thread.sleep(3000);
	   d.findElement(By.xpath("//input[@type='submit']")).click();
	   Thread.sleep(3000);
   }
   
   @Then("^I should get successfully registered$")
   public void I_should_get_successfully_registered()
   {
	   d.close();
   }
}
