Feature: Application Login functionality

  Scenario: User logs in with valid email and password in application
    Given the user is on the application login page
    When the user enters valid application email and password
    And the user clicks the application login button
    Then the user should login successfully into the application