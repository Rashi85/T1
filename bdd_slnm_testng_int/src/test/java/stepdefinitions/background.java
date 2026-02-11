package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class background {

	 @Given("User is on HRMLogin page {string}")
	    public void loginTest(String url) {
	 
	        System.out.println("I am in Login Page");
	 
	    }
	 
	    @When("User enters username as {string} and password as {string}")
	    public void goToHomePage(String userName, String passWord) {
	 
	        System.out.println("Go to Home Page");
	 
	    }
	 
	    @Then("User should be able to login successfully and new page open")
	    public void verifyLogin() {
	 
	        System.out.println("Home Page is opened");
	 
	    }
	 
	    @Then("User should be able to see a message {string} below Username")
	    public void verifyMissingUsernameMessage(String message) {
	 
	        System.out.println("Login failed with an error message");
	    }
	 
}
