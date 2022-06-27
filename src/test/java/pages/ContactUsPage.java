package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {
    public ContactUsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/contact_us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "(//h2)[2]")
    public WebElement getinTouchText;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectTextBox;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement messageTextBox;

    @FindBy(xpath = "//input[@name=''upload_file']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[.='Success! Your details have been submitted successfully.']")
    public WebElement succesMessageText;

    @FindBy(xpath = "//span[.=' Home']")
    public WebElement homeButton;

}
