Feature: Logout user


  Scenario Outline: TC06 Logout user succesfully
  Given Launch browser
  Then  Navigate to url "HomePageUrl"
  Then Verify that home page is visible successfully
  Then Click on Signup Login button
  And Verify Login to your account is visible
  When Enter correct "<email>" address and "<password>" using scenario Outliine
  Then Click login button
  Then Verify that Logged in as username is visible
  Then Click Logout button
  Then Verify that user is navigated to login page


    Examples:
    |email|password|
    |ferhatdeneme@gmail.com|123456|

