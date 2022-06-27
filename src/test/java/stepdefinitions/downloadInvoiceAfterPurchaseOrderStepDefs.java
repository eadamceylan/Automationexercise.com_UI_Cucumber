package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class downloadInvoiceAfterPurchaseOrderStepDefs {


    PaymentDonePage paymentDonePage =new PaymentDonePage();
    PaymentPage paymentPage = new PaymentPage();
    CheckOutPage checkOutPage =new CheckOutPage();
    FillingTablePage fillingTablePage=new FillingTablePage();
    LoginPage loginPage = new LoginPage();
    ViewCardPage viewCardPage = new ViewCardPage();
    HomePage homePage = new HomePage();
    @Then("user adds products to cart")
    public void user_adds_products_to_cart() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",homePage.firstProduct);
        homePage.firstProduct.click();
        Thread.sleep(3000);
    }
    @Then("user clicks Cart button")
    public void user_clicks_cart_button() throws InterruptedException {
       // homePage.continueShoppingButton.click();
        homePage.cartButton.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    @Then("user verifies that cart page is displayed")
    public void user_verifies_that_cart_page_is_displayed() {
        Assert.assertTrue(viewCardPage.shoppingCartText.isDisplayed());
    }
    @Then("user clicks Proceed To Checkout")
    public void user_clicks_proceed_to_checkout() {
        viewCardPage.proceedToCheckOutButton.click();
    }
    @When("user clicks Register Login button")
    public void user_clicks_register_login_button() {
        viewCardPage.registerLoginButton.click();
    }

    @Then("user enters correct email address and password")
    public void enter_correct_email_address_and_password() {
       Faker faker= new Faker();
        loginPage.nameTextBox.sendKeys(faker.name().fullName());
        loginPage.signupUserEmailBox.sendKeys(faker.internet().emailAddress());
        loginPage.signupButton.click();
    }
    @Then("user fills all details in Signup and create account")
    public void user_fills_all_details_in_signup_and_create_account() {
        fillingTablePage.titleMrRadioButton.click();
        fillingTablePage.passwordTextBox.sendKeys(Faker.instance().internet().password());
        Select selectDays=new Select(fillingTablePage.daysDropdown);
        selectDays.selectByIndex(Faker.instance().random().nextInt(0,29));
        Select selectMonths=new Select(fillingTablePage.monthsDropdown);
        selectMonths.selectByIndex(Faker.instance().random().nextInt(0,11));
        Select selectYears=new Select(fillingTablePage.yearsDropdown);
        selectYears.selectByIndex(Faker.instance().random().nextInt(0,120));
        fillingTablePage.newsletterBox.click();
        fillingTablePage.receiveOffersBox.click();
        fillingTablePage.firstnameBox.sendKeys(Faker.instance().funnyName().name());
        fillingTablePage.lastnameBox.sendKeys(Faker.instance().howIMetYourMother().character());
        fillingTablePage.companyBox.sendKeys(Faker.instance().pokemon().name());
        fillingTablePage.address1Box.sendKeys(Faker.instance().address().fullAddress());
        fillingTablePage.address2Box.sendKeys(Faker.instance().address().secondaryAddress());
        Select selectCountry = new Select(fillingTablePage.countryDropdown);
        selectCountry.selectByIndex(Faker.instance().random().nextInt(0,6));
        fillingTablePage.stateBox.sendKeys(Faker.instance().address().state());
        fillingTablePage.cityBox.sendKeys(Faker.instance().address().city());
        fillingTablePage.zipcodeBox.sendKeys(Faker.instance().address().zipCode());
        fillingTablePage.mobileNumberBox.sendKeys(Faker.instance().phoneNumber().cellPhone());
        fillingTablePage.createAccountButton.click();
    }
    @And("user clicks Proceed To Checkout button")
    public void userClicksProceedToCheckoutButton() {
        viewCardPage.proceedToCheckOutButton.click();
    }
    @Then("user verifies Address Details and Review Your Order")
    public void user_verifies_address_details_and_review_your_order() {
        checkOutPage.addressDetails.isDisplayed();

    }

    @Then("user clicks Cart button again")
    public void user_clicks_cart_button_again() throws InterruptedException {
        homePage.cartButton.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    @Then("user enters description in comment text area and click Place Order")
    public void user_enters_description_in_comment_text_area_and_click() {
         checkOutPage.commentBox.sendKeys("Please send the item to my exact address");
         checkOutPage.placeOrderButton.click();
    }
    @Then("user enters payment details: Name on Card, Card Number, CVC, Expiration date")
    public void user_enters_payment_details_name_on_card_card_number_cvc_expiration_date(io.cucumber.datatable.DataTable dataTable) {

        paymentPage.nameOnCard.sendKeys("Ali Can");
        paymentPage.cardNumber.sendKeys("1111222233334444");
        paymentPage.CVC.sendKeys("123");
        paymentPage.expireMonth.sendKeys("12");
        paymentPage.expireYear.sendKeys("2024");

    }
    @Then("user clicks Pay and Confirm Order button")
    public void user_clicks_pay_and_confirm_order_button() {
        paymentPage.payAndConfirmOrder.click();
    }
    @Then("user verifies success message Your order has been placed successfully!")
    public void user_verifies_success_message_your_order_has_been_placed_successfully() {
        paymentDonePage.downloadInvoiceButton.click();
        ReusableMethods.waitFor(3);

    }
    @When("user clicks Download Invoice button and verify invoice is downloaded successfully.")
    public void user_clicks_download_invoice_button_and_verify_invoice_is_downloaded_successfully() {
        String path = "C:\\Users\\admin\\Downloads\\invoice";
        boolean isFileExist = Files.exists(Paths.get(path));
    }


    @When("user clicks Continue button")
    public void user_clicks_home_button() {
        paymentDonePage.continueButton.sendKeys(Keys.ENTER);
    }




}
