package techproed.tests.day27_SmokeTest_Excel;

import org.apache.commons.io.filefilter.ConditionalFileFilter;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

public class C03_BlueRentalExcelTest {

    /**
    //BlueRentalCar sayfasina gidelim
        // mysmoketestdata excel dosyasindan bir kullanici ile login olalim
        // Login oldugumuzu dogrulayalim
        // Sayfayi kapatalim
     */


    @Test
    public void test01() {
        /**
    Test yaptığımız sayfadaki dataları .properties yada excel dosyasından alabiliriz.
.properties dosyasından verileri okuyabilmemiz için ConfigReader class'ı oluşturmuştuk, Aynı şekilde
excel dosyasındaki verileri okuyabilmek için ExcelReader class'ı oluşturduk. Burdan alacağımız
email ve password bilgilerini String bir değişkene assing edip login testi yapacağımız sitede
sendKeys() methodu ile çok rahat kullanabiliriz.
        */

        /*
        String filePath = "src/test/java/techproed/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";
        ExcelReader reader = new ExcelReader(filePath,sheetName);
         */
        ExcelReader reader = new ExcelReader("src/test/java/techproed/resources/mysmoketestdata.xlsx","customer_info");
        String email = reader.getCellData(1, 0);  // E-mail bilgisini verir
        String password = reader.getCellData(1, 1);  // Password bilgisini verir


        //BlueRentalCar sayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));


        // mysmoketestdata excel dosyasindan bir kullanici ile login olalim
        BlueRentalPage rentalPage = new BlueRentalPage();
        rentalPage.login.click();
        ReusableMethods.bekle(2);
        rentalPage.email.sendKeys(email, Keys.TAB, password, Keys.ENTER);


        // Login oldugumuzu dogrulayalim
        Assert.assertTrue(rentalPage.loginVerify.isDisplayed());

        ReusableMethods.bekle(2);


        // Sayfayi kapatalim
        Driver.closeDriver();





    }
}
