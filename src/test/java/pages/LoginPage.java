package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//h2)[1]")
    public WebElement loginYourAccountText;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//h1[.='Delete Account']")
    public WebElement deleteAccountText;

    @FindBy(xpath = "(//p)[1]")
    public WebElement negativeLoginText;

    @FindBy(xpath = "//a[contains(text(),' Logout')]")
    public WebElement logoutButton;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignupText;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement signupUserEmailBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButton;

    @FindBy(xpath = "//p[.='Email Address already exist!']")
    public WebElement emailAlreadyExistText;


}
