package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViewCardPage {

    public ViewCardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement shoppingCartText;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckOutButton;

    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLoginButton;






}
