package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.RegisterUserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegisterUserStepDefinition {
    RegisterUserPage registerUserPage=new RegisterUserPage();
    @Given("Launch browser")
    public void launchBrowser() {
        Driver.getDriver();
    }

    @And("Navigate to url {string}")
    public void navigateToUrl(String mainPage) {
        Driver.getDriver().navigate().to(ConfigReader.getProperty(mainPage));
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Automation Exercise";
        assertEquals(expectedTitle,actualTitle);
    }


    @Then("Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        registerUserPage.signupLoginButton.click();
    }

    @And("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        assertTrue(registerUserPage.newUserSignupWebElement.isDisplayed());
    }

    @Then("Enter name and email address")
    public void enterNameAndEmailAddress() {
    registerUserPage.signUpNameTextBox.sendKeys(Faker.instance().name().firstName());
    registerUserPage.signupEmailTextBox.sendKeys(Faker.instance().internet().emailAddress());
    }

    @And("Click Signup button")
    public void clickSignupButton() {
        registerUserPage.signupButton.click();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        assertTrue(registerUserPage.enterAccountInformationWebElement.isDisplayed());
    }





    @Then("waits {int} seconds")
    public void waitsSeconds(int saniye) {
        ReusableMethods.waitFor(saniye);
    }



}
