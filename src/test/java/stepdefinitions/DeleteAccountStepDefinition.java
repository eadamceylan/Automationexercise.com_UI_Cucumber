package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.DeleteAccountPage;

import static org.junit.Assert.assertTrue;

public class DeleteAccountStepDefinition {
    DeleteAccountPage deleteAccountPage=new DeleteAccountPage();

    @Then("Click Continue button")
    public void click_continue_button() {
       deleteAccountPage.continueButton.click();
    }
    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
    assertTrue(deleteAccountPage.loggedinText.isDisplayed());
    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {
     deleteAccountPage.deleteAccountButton.click();
    }
    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
     assertTrue(deleteAccountPage.deleteAccountText.isDisplayed());
    }

}
