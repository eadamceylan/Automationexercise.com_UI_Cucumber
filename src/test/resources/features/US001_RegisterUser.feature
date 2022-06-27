@US01
Feature: Register_User_Functionality

  @Register
  Scenario:TC01_register_page
  Given Launch browser
  And Navigate to url "HomePageUrl"
  Then Verify that home page is visible successfully
    Then waits 2 seconds
  Then Click on Signup Login button
  And Verify New User Signup! is visible
  Then Enter name and email address
  And Click Signup button
  Then Verify that ENTER ACCOUNT INFORMATION is visible

  Then Fill details: Title, Name, Email, Password, Date of birth
  And Select checkbox Sign up for our newsletter!
  Then Select checkbox Receive special offers from our partners!
  Then Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
  And Click Create Account button
  Then Verify that ACCOUNT CREATED! is visible


      Then Click Continue button
  And Verify that Logged in as username is visible
  Then Click Delete Account button
  And Verify that ACCOUNT DELETED! is visible and click Continue button
