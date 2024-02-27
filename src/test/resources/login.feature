@login
Feature: Login

@web
  Scenario: Login using valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage

  @web
  Scenario: Login using invalid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "invalid"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"

  @web
  Scenario: user login without filling in the registered username and password
    Given user is on login page
    When user click login button
    Then user able to see error message "Epic sadface: Username is required"


  @web
  Scenario: Verify that the entered password does not contain visible letters/numbers
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then When the user enters the password, the password is hidden (not visible)

  @web
  Scenario: Log in using the blocked username and password
    Given user is on login page
    And user input username with "locked_out_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user able to see error message "Epic sadface: Sorry, this user has been locked out."
