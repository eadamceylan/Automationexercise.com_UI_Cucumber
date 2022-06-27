package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PaymentDonePage {

    public PaymentDonePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement successMessage;

    @FindBy(linkText = "Download Invoice")
    public WebElement downloadInvoiceButton;


    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@class='fa fa-home']")
    public WebElement homeButton;




}
