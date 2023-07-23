package techproed.tests.day27_SmokeTest_Excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C01_NegativeTest {

    /**
    //Description:
//Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali !!
//Acceptance Criteria
//Customer email: fake@bluerentalcars.com
//Customer password: fakepass
//Error:
//User with email fake@bluerentalcars.com not found
     */

    @Test(groups = "smoke")
    public void test01() {

        //BlueRental sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        //Login butonuna tıklayınız
        BlueRentalPage rentalPage = new BlueRentalPage();
        rentalPage.login.click();
        ReusableMethods.bekle(2);
        rentalPage.email.sendKeys(ConfigReader.getProperty("fake_email"),Keys.TAB,
                ConfigReader.getProperty("fake_password"), Keys.ENTER);

        //Hata mesajının görünür olduğunu doğrula
        ReusableMethods.visibleWait(rentalPage.messageVerify,5);
        Assert.assertTrue(rentalPage.messageVerify.isDisplayed());

        //Sayfayı kapatınız
        Driver.closeDriver();

    }
}
/*
PDF'Deki US_3_4_5 Ödev
 */
