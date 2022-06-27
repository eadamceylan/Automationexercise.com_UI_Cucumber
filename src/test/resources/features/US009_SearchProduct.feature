Feature: US009 search product
  Scenario: TC11 Serached products should be visible

  Given Launch browser
  When Navigate to url "HomePageUrl"
  Then Verify that home page is visible successfully
  Then Click on Products button
  Then Verify user is navigated to ALL PRODUCTS page successfully
  Then Enter product name in search input and click search button
  Then Verify SEARCHED PRODUCTS is visible
  Then Verify all the products related to search are visible