package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FillingTablePage {
    public FillingTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement titleMrRadioButton;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement daysDropdown;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement monthsDropdown;

    //1900-2021
    @FindBy(xpath = "//select[@id='years']")
    public WebElement yearsDropdown;

    @FindBy(xpath = "//input[@name='newsletter']")
    public WebElement newsletterBox;

    @FindBy(xpath = "//input[@name='optin']")
    public WebElement receiveOffersBox;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstnameBox;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastnameBox;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement companyBox;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1Box;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2Box;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement stateBox;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityBox;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcodeBox;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobileNumberBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//b[.='Account Created!']")
    public  WebElement accountCreatedText;



}
