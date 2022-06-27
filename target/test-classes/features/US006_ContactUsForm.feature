@US006
Feature: Contact us form

  Scenario: TC08 User can contact us

  When Launch browser
  Given Navigate to url "HomePageUrl"
  Then Verify that home page is visible successfully
  Then Click on Contact Us button
  And Verify GET IN TOUCH is visible
  Then Enter name, email, subject and message
  Then Upload file
  And Click OK button
  Then Click Submit button
  Then Verify success message Success! Your details have been submitted successfully. is visible
  Then Click Home button and verify that landed to home page successfully