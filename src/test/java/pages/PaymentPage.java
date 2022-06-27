package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PaymentPage {

    public PaymentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='name_on_card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//*[@name='card_number']")
    public WebElement cardNumber;

    @FindBy(xpath = "//*[@name='cvc']")
    public WebElement CVC;

    @FindBy(xpath = "//*[@name='expiry_month']")
    public WebElement expireMonth;

    @FindBy(xpath = "//*[@name='expiry_year']")
    public WebElement expireYear;

    @FindBy(xpath = "//*[@id='submit']")
    public WebElement payAndConfirmOrder;









}
