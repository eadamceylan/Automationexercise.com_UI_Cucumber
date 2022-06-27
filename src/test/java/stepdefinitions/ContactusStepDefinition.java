package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ContactUsPage;
import utilities.Driver;
import utilities.JSUtils;

public class ContactusStepDefinition {
    ContactUsPage contactUsPage=new ContactUsPage();

    @Then("Click on Contact Us button")
    public void clickOnContactUsButton() {
    contactUsPage.contactUsButton.click();
    }

    @And("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        Assert.assertTrue(contactUsPage.getinTouchText.isDisplayed());
    }

    @Then("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {
        Driver.waitAndSendText(contactUsPage.nameTextBox, Faker.instance().name().firstName());
        Driver.waitAndSendText(contactUsPage.emailTextBox, Faker.instance().internet().emailAddress());
        Driver.waitAndSendText(contactUsPage.subjectTextBox, Faker.instance().pokemon().name());
        Driver.waitAndSendText(contactUsPage.messageTextBox, Faker.instance().howIMetYourMother().character());
    }

    @Then("Upload file")
    public void uploadFile() {
        String path="src/test/resources/testData/file.webp";
        Driver.waitAndSendText(contactUsPage.uploadFileButton,path);
    }

    @Then("Click Submit button")
    public void clickSubmitButton() {
        contactUsPage.submitButton.click();
    }

    @And("Click OK button")
    public void clickOKButton() {
        Driver.wait(5);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertTrue(contactUsPage.succesMessageText.isDisplayed());
    }

    @Then("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        contactUsPage.homeButton.click();
        String expectedTitle="Automation Exercise";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
