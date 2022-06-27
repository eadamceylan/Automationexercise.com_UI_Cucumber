@US02
Feature: Login User with correct
  Scenario: TC02 Login User with correct email and password
  Given Launch browser
  Then Navigate to url "HomePageUrl"
  Then Verify that home page is visible successfully
  And Click on Signup Login button
  Then Verify Login to your account is visible
  And Enter correct email address and password
    |email|password|
    |ferhatdeneme@gmail.com|123456|
  Then Click login button
    And waits 2 seconds
  Then Verify that Logged in as username is visible
  And Click Delete Account button
  Then Verify that ACCOUNT DELETED! is visible