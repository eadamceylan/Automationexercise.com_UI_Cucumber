package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class LoginStepDefinition {
    LoginPage loginPage=new LoginPage();

    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }
    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password(io.cucumber.datatable.DataTable dataTable) {
        List<String> loginCredintals=dataTable.row(1);
        loginPage.emailBox.sendKeys(loginCredintals.get(0));
        loginPage.passwordBox.sendKeys(loginCredintals.get(1));
    }

    @Then("Click login button")
    public void click_login_button() {
    loginPage.loginButton.click();
    }
    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
       assertTrue(loginPage.deleteAccountText.isDisplayed());
    }

    @Then("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {

    String path="src/test/resources/testData/testData.xlsx";
    String sheetName="Sayfa1";
        ExcelUtil excelUtil =new ExcelUtil(path,sheetName);
        List<Map<String, String>> loginData = excelUtil.getDataList();
        loginPage.emailBox.sendKeys(loginData.get(0).get("Email"));
        loginPage.passwordBox.sendKeys(loginData.get(0).get("Password"));
    }
    
    @And("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        assertTrue(loginPage.negativeLoginText.isDisplayed());
    }

    @When("Enter incorrect email and correct password")
    public void enterIncorrectEmailAndCorrectPassword() {
        String path = "src/test/resources/testData/testData.xlsx";
        String sheetName = "Sayfa1";
        ExcelUtil excelUtil =new ExcelUtil(path,sheetName);
        List<Map<String, String>> loginData = excelUtil.getDataList();
        loginPage.emailBox.sendKeys(loginData.get(1).get("Email"));
        loginPage.passwordBox.sendKeys(loginData.get(1).get("Password"));
    }

    @When("Enter correct email and incorrect password")
    public void enterCorrectEmailAndIncorrectPassword() {
        String path="src/test/resources/testData/testData.xlsx";
        String sheetName="Sayfa1";
        ExcelUtil excelUtil=new ExcelUtil(path,sheetName);
        List<Map<String,String>>loginData=excelUtil.getDataList();
        loginPage.emailBox.sendKeys(loginData.get(2).get("Email"));
        loginPage.passwordBox.sendKeys(loginData.get(2).get("Password"));
    }

    @Then("Click Logout button")
    public void clickLogoutButton() {
        loginPage.logoutButton.click();
    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }


    @When("Enter correct {string} address and {string} using scenario Outliine")
    public void enterCorrectAddressAndUsingScenarioOutliine(String email, String password) {
        loginPage.emailBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password);
    }

    @Then("Enter name and already registered email address")
    public void enter_name_and_already_registered_email_address(io.cucumber.datatable.DataTable dataTable) {
        List<String> loginCredintals=dataTable.row(1);
        loginPage.nameTextBox.sendKeys(loginCredintals.get(0));
        loginPage.signupUserEmailBox.sendKeys(loginCredintals.get(1));

    }
    @Then("Verify error Email Address already exist! is visible")
    public void verify_error_email_address_already_exist_is_visible() {
       Assert.assertTrue(loginPage.emailAlreadyExistText.isDisplayed());
    }

    @Then("Click newuser Signup button")
    public void click_newuser_signup_button() {
        loginPage.signupButton.click();
    }

}
