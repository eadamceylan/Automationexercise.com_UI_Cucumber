package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchProductPage {
    public SearchProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchProductBox;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement searchProductButton;

    @FindBy(xpath = "//h2[.='Searched Products']")
    public WebElement searchedProductsText;

    @FindBy(xpath = "//a[@class='btn btn-default add-to-cart']")
    public WebElement searchedProducts;
}
