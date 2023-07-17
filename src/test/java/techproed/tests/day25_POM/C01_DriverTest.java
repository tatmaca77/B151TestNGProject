package techproed.tests.day25_POM;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class C01_DriverTest {
    @Test
    public void test01() {
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://youtube.com");
        Driver.getDriver().get("https://facebook.com");
        Driver.quitDriver();
        /*
        Bu methodda driver'ı if bloğu içine almadığımızdan dolayı
        her sayfa için yeni bir driver açtığının örneğini gösterdik
         */

    }

    @Test
    public void test02() {
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://youtube.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://facebook.com");
    }

    @Test
    public void test03() {
        //Driver driver = new Driver();
        //driver.getDriver().get("https://amazon.com");
        /*
        Bu örnekte Driver class'ında singeleton pattern kullanarak obje oluşturmanın önüne
        geçmiş olduk
         */
    }

}
