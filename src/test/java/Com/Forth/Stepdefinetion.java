package Com.Forth;



import java.util.List;
import java.util.Map;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Stepdefinetion {
	
	@Given("open the chrome")
	public void open_the_chrome() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("enter the Url")
	public void enter_the_Url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter credentials")
	public void i_enter_credentials(io.cucumber.datatable.DataTable dataTable) 
	{
		List<Map<String,String>> list= dataTable.asMaps(String.class, String.class);
		for(int i=0; i<list.size();i++) 
		{
			System.out.println(list.get(i).get("email"));
			System.out.println(list.get(i).get("pw"));
		}
//throw new cucumber.api.PendingException();
	
	} 
	@Then("I click on login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}


