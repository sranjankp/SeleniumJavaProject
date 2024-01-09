package stepdiffinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class softwaretesterSH {

		  @Given("^I am a \"(.*)\" software tester$")
		    public void i_am_a_good_software_tester(String Typeofsoftwaretester){
			  
			  System.out.println(" 1 I am a "+Typeofsoftwaretester+" software tester");
		     
		    }

		    @When("^I go to work$")
		    public void i_go_to_work() {
		    	
		    	System.out.println("2 I go to work");
		      
		    }

		    @And("^I \"([a-zA-Z]{1,})\" with it$")
		    public void i_involve_with_it(String worktype)  {
		    	
		    	System.out.println("3 I "+worktype+" with it");
		       
		    }
		    
		    @Then("^My boss \"(.*)\" me$")
		    public void my_boss_loves_me(String bossreaction)  {
		    	
		    	System.out.println("4 My boss "+bossreaction+" me");
		      
		    }

		}

// \"([a-zA-Z]{1,})\"= Accept only alphabet
// \"({^\"}*)\"= Accept all
//  \"(.*)\" =Accept all
