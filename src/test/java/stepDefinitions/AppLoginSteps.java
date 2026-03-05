package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class AppLoginSteps {

    @Given("the user is on the application login page")
    public void user_on_application_login_page() {
        System.out.println("User is on application login page");
    }

    @When("the user enters valid application email and password")
    public void user_enters_application_credentials() {
        System.out.println("User enters application credentials");
    }

    @And("the user clicks the application login button")
    public void user_clicks_application_login_button() {
        System.out.println("User clicks application login button");
    }

    @Then("the user should login successfully into the application")
    public void user_login_application_success() {
        System.out.println("Application login successful");
    }
}