@US024
Feature: US024 Download Invoice after purchase order

  Scenario: Invoice should be downloaded after purchase order
    Given Launch browser
    And Navigate to url "HomePageUrl"
    Then Verify that home page is visible successfully
      Then waits 2 seconds
    And user adds products to cart
    Then user clicks Cart button
    Then user verifies that cart page is displayed
    And user clicks Proceed To Checkout
    When user clicks Register Login button
    And user enters correct email address and password
    Then user fills all details in Signup and create account
    Then Verify that ACCOUNT CREATED! is visible
    Then Click Continue button
    And Verify that Logged in as username is visible
    Then user clicks Cart button
    And user clicks Proceed To Checkout button
    And user verifies Address Details and Review Your Order
    And user enters description in comment text area and click Place Order
    And user enters payment details: Name on Card, Card Number, CVC, Expiration date
      | Name on card | Card number      | CVC | Expiration date |
      | Adam Stone   | 1111111111111111 | 234 | 1123            |
    Then user clicks Pay and Confirm Order button
    And user verifies success message Your order has been placed successfully!
    When user clicks Download Invoice button and verify invoice is downloaded successfully.
    And user clicks Continue button
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible

