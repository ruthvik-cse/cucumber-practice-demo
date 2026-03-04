package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class LoginSteps {

    @Given("the user is on the login page")
    public void user_on_login_page() {
        System.out.println("User is on login page");
    }

    @When("the user enters a valid email and password")
    public void user_enters_valid_credentials() {
        System.out.println("User enters valid email and password");
    }

    @When("the user enters an invalid email and password")
    public void user_enters_invalid_credentials() {
        System.out.println("User enters invalid email and password");
    }

    @And("the user clicks on login button")
    public void user_clicks_login_button() {
        System.out.println("User clicks login button");
    }

    @Then("the user should be logged in successfully to the application")
    public void user_login_success() {
        System.out.println("Login successful");
    }

    @Then("the user should see an error message")
    public void user_sees_error_message() {
        System.out.println("Error message displayed");
    }
}