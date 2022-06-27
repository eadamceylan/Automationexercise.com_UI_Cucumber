@US008
Feature:US008_VerifyAllProductsAndProductDetailPage

  Scenario: TC10 product detail should be visible

  When Launch browser
  Then Navigate to url "HomePageUrl"
  Then Verify that home page is visible successfully
  And Click on Products button
  Then Verify user is navigated to ALL PRODUCTS page successfully
  Then The products list is visible
  Then Click on View Product of first product
  Then User is landed to product detail page
  Then Verify that detail detail is visible: product name, category, price, availability, condition, brand