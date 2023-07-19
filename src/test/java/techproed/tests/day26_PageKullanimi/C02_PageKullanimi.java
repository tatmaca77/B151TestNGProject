package techproed.tests.day26_PageKullanimi;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePageClass;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_PageKullanimi {

    @Test
    public void test01() {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperty("openSourceUrl"));
        //Username : Admin
        //Password : admin123


        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
        OpenSourcePageClass.username().sendKeys(ConfigReader.getProperty("OpenSourceusername"));
        OpenSourcePageClass.password().sendKeys(ConfigReader.getProperty("OpenSourcepassword"));
        OpenSourcePageClass.submitbutton().click();



        //Login Testinin basarili oldugunu test et
        Assert.assertTrue(OpenSourcePageClass.verify().isDisplayed());



        //sayfayı kapatınız
        Driver.closeDriver();

    }
}
