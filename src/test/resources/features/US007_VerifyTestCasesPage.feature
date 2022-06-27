@US007
Feature: US007 Verify Test Cases Page
  Scenario: TC09 User should be navigated to Test Cases Page

  When Launch browser
  Then Navigate to url "HomePageUrl"
  Then Verify that home page is visible successfully
  Then Click on Test Cases button
  Then Verify user is navigated to test cases page successfully