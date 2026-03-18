package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppLoginSteps {

    WebDriver driver;
    @Given("the user is on the login page")
    public void user_on_application_login_page() {
        System.out.println("User is on application login page");

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ruthv\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("the user enters a valid {string} and {string}")
    public void user_enters_application_credentials_outline(String email, String password) {
        System.out.println("User enters application credentials");
        driver.findElement(By.id("username")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("the user enters an invalid {string} and {string}")
    public void user_enters_invalid_email_and_password(String email, String password) {
        System.out.println("User enters invalid credentials");
        driver.findElement(By.id("username")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("the user clicks on login button")
    public void user_clicks_application_login_button() {
        System.out.println("User clicks application login button");
        driver.findElement(By.id("submit")).click();
    }

    @Then("the user should be logged in successfully to the application")
    public void user_login_application_success() {
        System.out.println("Application login successful");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        if(currentUrl.contains("practice-test-login/")){
            throw new RuntimeException("User has not loggin in");
        }
        else{
            assert true;
        }
        driver.quit();
    }

    @Then("the user should see {string}")
    public void the_user_should_be_logged_in_successfully_outline(String result) {
        // Verify that login was successful
        System.out.println("the user should be logged in successfully");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl" + currentUrl);

        if (currentUrl.contains(result)) {
            assert true;
        } else {
            assert false;
        }
        driver.quit();
    }

    @Then("the user should see an error message")
    public void user_sees_error_message() {
        // Verify that an error message is shown for invalid credentials
        System.out.println("the user should see an error message");
        System.out.println("the user should be logged in successfully");

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl" + currentUrl);

        if (currentUrl.contains("practice-test-login/")) {
            assert false;
        }
        else {
            assert true;
        }
        driver.quit();
    }
}