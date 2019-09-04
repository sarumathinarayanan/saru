package cumber123;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class class1 {
	@When("i enter user id in {string} the user id field")
	public void i_enter_user_id_in_the_user_id_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Username"+string);
	}

	@When("password in {string} the password field")
	public void password_in_the_password_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Password"+string);
	}

	@When("i click on login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("login ");
	}

	@Then("the homepage is displayed")
	public void the_homepage_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Homepage is displayed");
	}

	

}
