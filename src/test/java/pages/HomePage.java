package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
    public WebElement firstProduct;



    @FindBy(xpath = "//*[@id=\"header\"]//div[2]//ul/li[3]/a")
    public WebElement cartButton;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShoppingButton;









}


