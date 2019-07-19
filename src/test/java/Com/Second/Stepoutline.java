package Com.Second;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepoutline {
	@Given("User enters outline {string} in the email field")
	public void enter_in_the_email_feild(String email) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(email); 
	}
	
	@And("Enter outline {int} in the password feild")
	public void enter_in_the_password_feild(Integer pwd) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(pwd); 
	}
	
	

	@When("Click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("logged on"); 
	}

	@Then("The home page is visible")
	public void the_home_page_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("visible"); 
	}



}
