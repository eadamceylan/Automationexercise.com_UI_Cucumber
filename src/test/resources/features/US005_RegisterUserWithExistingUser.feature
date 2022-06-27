@US005
Feature: Register user with existing user

  Scenario: TC07 Registe with existing mail

  When Launch browser
    Given Navigate to url "HomePageUrl"
    Then Verify that home page is visible successfully
    And Click on Signup Login button
    Then Verify New User Signup! is visible
    And Enter name and already registered email address
    |email|password|
    |ferhat|ferhatdeneme@gmail.com|
    Then Click newuser Signup button
    And Verify error Email Address already exist! is visible