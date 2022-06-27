@US010
Feature: US010_Verify Subscrition

  Scenario: TC12 Verify success message should be visible

  When Launch browser
  Then Navigate to url "HomePageUrl"
  Then Verify that home page is visible successfully
  Then Scroll down to footer
  And Verify text SUBSCRIPTION
  Then Enter email address in input and click arrow button
  And Verify success message You have been successfully subscribed! is visible