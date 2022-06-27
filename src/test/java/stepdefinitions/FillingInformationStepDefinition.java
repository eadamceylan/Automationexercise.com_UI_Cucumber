package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.FillingTablePage;

import static org.junit.Assert.assertTrue;

public class FillingInformationStepDefinition {
    FillingTablePage fillingTablePage=new FillingTablePage();
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        fillingTablePage.titleMrRadioButton.click();
        fillingTablePage.passwordTextBox.sendKeys(Faker.instance().internet().password());
        Select selectDays=new Select(fillingTablePage.daysDropdown);
        selectDays.selectByIndex(Faker.instance().random().nextInt(0,29));
        Select selectMonths=new Select(fillingTablePage.monthsDropdown);
        selectMonths.selectByIndex(Faker.instance().random().nextInt(0,11));
        Select selectYears=new Select(fillingTablePage.yearsDropdown);
        selectYears.selectByIndex(Faker.instance().random().nextInt(0,120));
    }
    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        fillingTablePage.newsletterBox.click();
    }
    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        fillingTablePage.receiveOffersBox.click();
    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
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
    }
    @Then("Click Create Account button")
    public void click_create_account_button() {
        fillingTablePage.createAccountButton.click();
    }
    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        assertTrue(fillingTablePage.accountCreatedText.isDisplayed());
    }


}
