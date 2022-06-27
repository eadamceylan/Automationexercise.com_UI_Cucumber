package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SearchProductPage;

public class SearchProductStepDefinition {
    SearchProductPage searchProductPage=new SearchProductPage();

    @Then("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
    searchProductPage.searchProductBox.sendKeys("Men Tshirt");
    searchProductPage.searchProductButton.click();
    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(searchProductPage.searchedProductsText.isDisplayed());
    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        Assert.assertTrue(searchProductPage.searchedProducts.isDisplayed());
    }
}
