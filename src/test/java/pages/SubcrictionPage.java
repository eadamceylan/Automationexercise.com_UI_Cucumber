package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SubcrictionPage {
    public SubcrictionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//footer[@id='footer']")
    public WebElement footerSection;

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subcriptionText;

    @FindBy(id = "susbscribe_email")
    public WebElement subscrbeEmailBox;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement arrowButton;

    @FindBy(id = "success-subscribe")
    public WebElement successSubscribeText;

    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement chartButton;
}
