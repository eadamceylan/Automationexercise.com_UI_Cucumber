package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class RegisterUserPage {
    public RegisterUserPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Signup")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignupWebElement;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement signUpNameTextBox;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement signupEmailTextBox;


    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButton;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccountInformationWebElement;



}
