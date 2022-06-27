package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckOutPage {

    public CheckOutPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "(//*[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement addressDetails;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement commentBox;

    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOrderButton;







}

