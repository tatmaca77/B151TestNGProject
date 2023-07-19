package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {

    /**
       TestNG'de locate'lerimizi "pages" package altinda olusturdugumuz Class'lar icinde aliriz.
     Bu Class icinde driver'imizi tanimlamak ve webelementleri olusturabilmek icin constructor olusturup bu constructor
     icinde "PageFactory" class'indan initelements methodunu kullanarak driver'imizi bu class'a tanimlariz.
     */

    public OpenSourcePage (){
        PageFactory.initElements(Driver.getDriver(), this);

        /**
        Webelemtleri locate edebilmek icin findElement() methodu kullaniyorduk.
     @FindBy notasyonu ile artik findElement() methodunu kullanmayip @FindBy notasyonu icinde driver'in yerini
     tarif etmemiz gerekiyor.
         Yukaridaki (Driver.getDriver(), this) komutu burada ihtiyac duydugum driver, Driver class'indaki
         getDriver() methodun'daki driver demek oluyor.
         */
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitbutton;

    @FindBy(xpath = "//h6")
    public WebElement verify;
}
