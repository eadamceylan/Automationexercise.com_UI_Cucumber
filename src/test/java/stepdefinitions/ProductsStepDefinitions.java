package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ProductsPage;
import pages.SubcrictionPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class ProductsStepDefinitions {
    ProductsPage productsPage=new ProductsPage();
    @Then("Click on Products button")
    public void click_on_products_button() {
        productsPage.productButton.click();
    }
    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(productsPage.allProductsText.isDisplayed());
    }
    @Then("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertEquals(35,productsPage.productList.size());
    }
    @Then("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        productsPage.firstProductviewProductButton.click();
    }
    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        String expectedUrl="https://automationexercise.com/product_details/1";
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());
    }
    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
       productsPage.productInformationList.stream().forEach(t-> Assert.assertTrue(t.isDisplayed()));
    }

    //TC12_Add Products in Cart

    @Then("Hover over first product and click Add to cart")
    public void hover_over_first_product_and_click_add_to_cart() {
        JSUtils.scrollIntoVIewJS(productsPage.firstProductWebElement);
        ReusableMethods.hover(productsPage.firstProductWebElement);
        ReusableMethods.waitFor(4);
        productsPage.hoverOverAddChartFirstButton.click();
    }
    @Then("Click Continue Shopping button")
    public void click_continue_shopping_button() {
    productsPage.continueButton.click();
    }
    @Then("Hover over second product and click Add to cart")
    public void hover_over_second_product_and_click_add_to_cart() {
        ReusableMethods.waitFor(4);
        ReusableMethods.hover(productsPage.secondProductWebElement);
        ReusableMethods.waitFor(4);
       productsPage.hoverOverAddChartSecondButton.click();
    }
    @Then("Click View Cart button")
    public void click_view_cart_button() {
        productsPage.viewChartButton.click();
    }
    @Then("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        Assert.assertEquals(2,productsPage.quantityBoxInCart.size());
    }
    @Then("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {

        int firstPrice = Integer.parseInt(productsPage.firstPrice.getText().replaceAll("[^0-9]", ""));

        int secondPrice = Integer.parseInt(productsPage.secondPrice.getText().replaceAll("[^0-9]", ""));

        String firstTotalPrice = productsPage.firstTotolPrice.getText().replaceAll("[^0-9]", "");

        String secondTotalPrice = productsPage.secondTotalPrice.getText().replaceAll("[^0-9]", "");

        Assert.assertEquals(500, firstPrice);
        Assert.assertEquals(400, secondPrice);
        Assert.assertEquals("1", productsPage.firstQuantity.getText());
        Assert.assertEquals("1", productsPage.secondQuantity.getText());
        Assert.assertEquals("500", firstTotalPrice);
        Assert.assertEquals("400", secondTotalPrice);
    }


}
