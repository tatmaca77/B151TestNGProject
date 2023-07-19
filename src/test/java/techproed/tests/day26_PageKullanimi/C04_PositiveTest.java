package techproed.tests.day26_PageKullanimi;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C04_PositiveTest {

    /**
    //Acceptance Criteria:
//Admin olarak, uygulamaya giriş yapabilmeliyim
//https://www.bluerentalcars.com/
//Admin email: jack@gmail.com
//Admin password: 12345
     */


    @Test
    public void test01() {
        //https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));


        //Logine tikla
        BlueRentalPage rentalPage = new BlueRentalPage();
        rentalPage.login.click();
        ReusableMethods.bekle(2);


        //Admin email: jack@gmail.com     --> .properties dosyasinda
        //Admin password: 12345           --> .properties dosyasinda
        rentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"), Keys.TAB,
                ConfigReader.getProperty("blueRentalPassword"),Keys.ENTER);
        ReusableMethods.bekle(2);


        //Giris yapildigini dogrulayalim
        Assert.assertTrue(rentalPage.loginVerify.getText().contains("Jack"));


        // Sayfayi kapatiniz
        Driver.closeDriver();


    }
}
