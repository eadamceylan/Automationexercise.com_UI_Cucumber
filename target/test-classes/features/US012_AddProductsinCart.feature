@US012
  Feature: US012 Add Products in Cart
    Scenario: TC14 Products should be added to cart

    When Launch browser
    Then Navigate to url "HomePageUrl"
    Then Verify that home page is visible successfully
    Then Click on Products button
    Then Hover over first product and click Add to cart
    Then Click Continue Shopping button
    Then Hover over second product and click Add to cart
    Then Click View Cart button
    Then Verify both products are added to Cart
    Then Verify their prices, quantity and total price