package techproed.tests.day26_PageKullanimi;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C01_PageKullanimi {

    /**
    //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
//kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
//Login Testinin basarili oldugunu test et
     */

    @Test
    public void test01() throws InterruptedException {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperty("openSourceUrl"));
        //Username : Admin
        //Password : admin123

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
        OpenSourcePage sourcePage = new OpenSourcePage();
        sourcePage.username.sendKeys(ConfigReader.getProperty("OpenSourceusername"));
        sourcePage.password.sendKeys(ConfigReader.getProperty("OpenSourcepassword"));
        sourcePage.submitbutton.click();

        Thread.sleep(3000);

        //Login Testinin basarili oldugunu test et
        Assert.assertTrue(sourcePage.verify.isDisplayed());

        //sayfayı kapatınız
        Driver.closeDriver();
    }

}
