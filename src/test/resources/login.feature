@login
Feature: Login

  @valid-login
  Scenario: Login using a valid username and password
    Given the user is on the login page
    And the user inputs the username "standard_user"
    And the user inputs the password "secret_sauce"
    When the user clicks the login button
    Then the user is redirected to the homepage

  @invalid-login
  Scenario: Login using invalid username and password
    Given the user is on the login page
    And the user inputs the username "invalid"
    And the user inputs the password "invalid"
    When the user clicks the login button
    Then the user sees the error message "Epic sadface: Username and password do not match any user in this service"

  @empty-login
  Scenario: Login using empty username and password
    Given the user is on the login page
    And the user inputs the username ""
    And the user inputs the password ""
    When the user clicks the login button
    Then the user sees the error message "Epic sadface: Username is required"