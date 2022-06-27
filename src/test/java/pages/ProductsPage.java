package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductsPage {
    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProductsText;

    @FindBy(xpath = "//div[@class='col-sm-4']")
    public List<WebElement> productList;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement firstProductviewProductButton;

    @FindBy(xpath = "//b")
    public List<WebElement> productInformationList;

    //TC12

    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public WebElement firstProductWebElement;

    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[2]")
    public  WebElement hoverOverAddChartFirstButton;

    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueButton;

    @FindBy(xpath = "(//div[@class='productinfo text-center'])[2]")
    public WebElement secondProductWebElement;

    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[4]")
    public  WebElement hoverOverAddChartSecondButton;

    @FindBy(tagName = "u")
    public WebElement viewChartButton;

    @FindBy(xpath = "//*[@class='disabled']")
    public List<WebElement> quantityBoxInCart;


    @FindBy(xpath = "(//*[@class='disabled'])[1]")
    public WebElement firstQuantity;

    @FindBy(xpath = "(//*[@class='disabled'])[2]")
    public WebElement secondQuantity;

    @FindBy(xpath = "(//*[@class='cart_price'])[1]")
    public WebElement firstPrice;

    @FindBy(xpath = "(//*[@class='cart_price'])[2]")
    public WebElement secondPrice;

    @FindBy(xpath = "(//*[@class='cart_total_price'])[1]")
    public WebElement firstTotolPrice;

    @FindBy(xpath = "(//*[@class='cart_total_price'])[2]")
    public WebElement secondTotalPrice;





}
