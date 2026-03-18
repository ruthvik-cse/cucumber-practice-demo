#Feature: Login functionality
#
#  Scenario Outline: User logs in with valid credentials
#    Given the user is on the login page
#    When the user enters a valid "<email>" and "<password>"
#    And the user clicks on login button
#    Then the user should be logged in successfully to the application
#    Examples:
#      | email | password |
#      |student|Password123|
#
#  Scenario Outline: User logs in with invalid credentials
#    Given the user is on the login page
#    When the user enters an invalid "<email>" and "<password>"
#    And the user clicks on login button
#    Then the user should see an error message
#  Examples:
#  | email | password |
#  | student |Password124|
