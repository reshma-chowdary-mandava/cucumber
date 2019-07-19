package Com.Third;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	
	@Before
	public void openbrowser1()
{
	  System.out.println("opened browser1");
}
@Before(order=0)
	public void openbrowser2()
{
	  System.out.println("opened browser2");
} 
	
	@Given("User Enters correct Email in the email field")
	public void user_Enters_correct_Email_in_the_email_field() {
	   System.out.println("Email");
	}

	@And("User Enters correct password in the password feild")
	public void user_Enters_correct_password_in_the_password_feild() {
		System.out.println("pwd");
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		System.out.println("login");
	}

	@Then("home page is dispalyed in the screen")
	public void home_page_is_dispalyed_in_the_screen() {
		System.out.println("screen displayed");
	}
	
		@After
		public void closebrowser1()
	{
		  System.out.println("closed browser1");
	}
		@After(order=0)
		public void closebrowser2()
	{
		  System.out.println("closed browser2");
	} 
	 


}
