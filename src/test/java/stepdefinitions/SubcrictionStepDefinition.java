package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SubcrictionPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class SubcrictionStepDefinition {
    SubcrictionPage subcrictionPage=new SubcrictionPage();

    @Then("Scroll down to footer")
    public void scroll_down_to_footer() {
        JSUtils.scrollIntoVIewJS(subcrictionPage.footerSection);
    }
    @Then("Verify text SUBSCRIPTION")
    public void verify_text_subscription() {
        Assert.assertTrue(subcrictionPage.subcriptionText.isDisplayed());
    }
    @Then("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {
        subcrictionPage.subscrbeEmailBox.sendKeys("ferhatdeneme@gmail.com");
        subcrictionPage.arrowButton.click();
    }
    @Then("Verify success message You have been successfully subscribed! is visible")
    public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
       Assert.assertTrue(subcrictionPage.successSubscribeText.isDisplayed());
    }

    @Then("Click Cart button")
    public void clickCartButton() {
        subcrictionPage.chartButton.click();
    }
}
