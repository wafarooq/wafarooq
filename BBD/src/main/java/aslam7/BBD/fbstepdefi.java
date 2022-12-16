package aslam7.BBD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbstepdefi {
	
	@Given("I navigate to facebook website")
	public void i_navigate_to_facebook_website() {
	   System.out.println("it will open browser and go to facebook");
	}

	@When("I enter username")
	public void i_enter_username() {
		
		 System.out.println("it will enter username");
	    
	}

	@When("I enter password")
	public void i_enter_password() {
		 System.out.println("it will enter password");
	}

	@Then("I an able to login")
	public void i_an_able_to_login() {
		 System.out.println("it will be logged in");
	}
	
	

}
