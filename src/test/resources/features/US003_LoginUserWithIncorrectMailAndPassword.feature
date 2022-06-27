@US03
Feature: Negative login

Background: access url
  Given Launch browser
  Then Navigate to url "HomePageUrl"
  Then Verify that home page is visible successfully
  And Click on Signup Login button
  Then Verify Login to your account is visible


  Scenario: TC03 Login User with incorrect email and password
  When Enter incorrect email address and password
  Then Click login button
  And Verify error Your email or password is incorrect! is visible

    Scenario: TC04 Login User with incorrect mail
      When Enter incorrect email and correct password
      Then Click login button
      And Verify error Your email or password is incorrect! is visible

      Scenario: TC05 Login User with incorrect password
        When Enter correct email and incorrect password
        Then Click login button
        And Verify error Your email or password is incorrect! is visible
