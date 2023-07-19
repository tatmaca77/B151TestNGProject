package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TestCenterPage {

    public TestCenterPage (){      // Constructor olusturmus olduk.
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy (xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy (xpath = "//*[@type='submit']")
    public WebElement submitbutton;

    @FindBy (xpath = "//div[@role='alert']")
    public WebElement loginVerify;

    @FindBy (xpath = "//a//i")
    public WebElement logout;

}
