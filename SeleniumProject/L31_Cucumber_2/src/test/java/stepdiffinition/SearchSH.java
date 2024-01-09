package stepdiffinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSH {

    @Given("^I visit the website as a guest user$")
    public void i_visit_the_website_as_a_guest_user() throws Throwable {
    	System.out.println("1.0 Given I visit the website as a guest user");
       
    }

    @When("^I select the books option from the dropdown$")
    public void i_select_the_books_option_from_the_dropdown() {
        System.out.println("1.1 When I select the books option from the dropdown");
    }

    @When("^I select the Baby option from the dropdown$")
    public void i_select_the_baby_option_from_the_dropdown() {
    	System.out.println("2.1 When I select the Baby option from the dropdown");
       
    }

    @Then("^I should see the books page loaded$")
    public void i_should_see_the_books_page_loaded()  {
    	System.out.println("1.3 Then I should see the books page loade");
       
    }

    @Then("^I should see the Baby page loaded$")
    public void i_should_see_the_baby_page_loaded()  {
    	System.out.println("2.2 Then I should see the Baby page loaded");
        
    }

    @And("^I click on Search icon$")
    public void i_click_on_search_icon() {
    	System.out.println("1.2 And I click on Search icon");
        
    }

    @And("^I should see Books at Amazon as heading$")
    public void i_should_see_books_at_amazon_as_heading()  {
    	System.out.println("1.4 And I should see Books at Amazon as heading");
      
    }

    @And("^I should see The baby store as heading$")
    public void i_should_see_the_baby_store_as_heading()  {
    	System.out.println("2.4 And I should see The baby store as heading");
       
    }

    @But("^I should not see other category products$")
    public void i_should_not_see_other_category_products()  {
    	System.out.println("1.5 But I should not see other category products ");
        
    }
}
