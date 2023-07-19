package techproed.tests.day25_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C03_PropertiesKullanimi {

    @Test
    public void amazonTest() {
        /** amazon sayfasina gidelim */
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


        /** basligin amazon icerdigini dogrulayalim */
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = ConfigReader.getProperty("expectedTitle");
        Assert.assertTrue(actualTitle.contains(expectedTitle));



        /** arama kutusunda iphone aratalim */
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys(ConfigReader.getProperty("searchText"),Keys.ENTER);


        /** sayfayi kapatalim */
        Driver.closeDriver();


        /** google sayfasina gidelim */
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));


        /** Sayfayi kapatalim */
        Driver.closeDriver();


        /** facebook sayfasina gidelim */
        Driver.getDriver().get("https://www.facebook.com");
        // Bu sekilde de olur. Illa ConfigReader'dan almaya gerek yok.
        // Eger ben 1 kere bu Url'e gideceksem bu sekilde gitmek mantiklidir. ConfigReader'da olma zorunlulugu yoktur.



        /** Sayfayi kapatalim */
        Driver.closeDriver();


    }
}
