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

    @Test
    public void test01() {
        //https://www.bluerentalcars.com/ adresine gidelim negatif senaryo ile login olamadığımızı test edelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("fake_email"), Keys.TAB,
                ConfigReader.getProperty("fake_password"),Keys.TAB,Keys.ENTER);
       ReusableMethods.visibleWait(blueRentalPage.messageVerify,5);
        Assert.assertTrue(blueRentalPage.loginVerify.isDisplayed());

        Driver.closeDriver();


    }
}
/*
PDF'Deki US_3_4_5 Ödev
 */
