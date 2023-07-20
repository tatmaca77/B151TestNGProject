package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {

    public BlueRentalPage (){      // Constructor olusturmus olduk.
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@role='button'])[1]")
    public WebElement login;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;                                   // Locate degisirse sadece burdan düzeltmek yeterli olur.

    @FindBy (id = "dropdown-basic-button")
    public WebElement loginVerify;

    @FindBy (id = "//*[@role='alert']")
    public WebElement messageVerify;



}
