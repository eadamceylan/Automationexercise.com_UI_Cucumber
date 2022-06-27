package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TestCasesPage;

public class TestCasesStepDefinitions {

    TestCasesPage testCasesPage=new TestCasesPage();

    @Then("Click on Test Cases button")
    public void click_on_test_cases_button() {
      testCasesPage.testCasesButton.click();
    }
    @Then("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        Assert.assertTrue(testCasesPage.testCasesText.isDisplayed());
    }
}
