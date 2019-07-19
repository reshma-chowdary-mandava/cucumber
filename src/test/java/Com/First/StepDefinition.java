package Com.First;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	@Given("User enters {string} in the email field")
	public void user_enters_in_the_email_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string); 
	}

	@And("Enter {int} in the password feild")
	public void enter_password_in_the_password_feild(int pwd) {
		System.out.println(pwd);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		System.out.println("Login clicked");
	}

	@Then("The home page is dispalyed")
	public void the_home_page_is_dispalyed() {
		System.out.println("home page is displayed");
	}
	
	@Given("User enters invalid email in the email feild")
    public void user_enters_invalid_email_in_the_email_feild() {
    System.out.println("Email is entered");
    }

    @And("Enter invalid password in the password feild")
    public void enter_invalid_password_in_the_password_feild() {
	System.out.println("password is entered");
    }
    
    @Then("The home page is not dispalyed")
	public void the_home_page_is_not_dispalyed() {
		System.out.println("home page is not displayed");

    }
}
