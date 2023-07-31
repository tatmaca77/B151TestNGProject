package techproed.tests.day30_Listeners;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

@Listeners(techproed.utilities.Listeners.class)//Bunu ekleyince fail olunca 1 kez daha calisir ve ITestListener methodlarini kullanir.
public class C03_ListenersTest03 {
    /**
        Eger fail olan testlerimizi otomatik olarak belirttigimiz sayi kadar calistirmak istersek
     Listeners class'indaki retry ve transform methodlari sayesinde calistirabiliriz. Bunun icin calistirmak istedigimiz
     test methodunun notasyonundan sonra parametre olarak retryAnalyzer parametresini kullanarak listeners class'inin
     yolunu belirtiriz.
     */
    @Test(retryAnalyzer = techproed.utilities.Listeners.class)
    public void googleTest() {
        Driver.getDriver().get("https://google.com");
        Driver.getDriver().findElement(By.id("dfbdlkvskvölv")).click();   // OLmayan WE 'Ye click yapmaya calisacaktir.
    }

    @Test(retryAnalyzer = techproed.utilities.Listeners.class)
    public void techproTest() {
        Driver.getDriver().get("https://techproeducation.com");
        Driver.getDriver().findElement(By.id("dfbdlkvskvölv")).click();   // OLmayan WE 'Ye click yapmaya calisacaktir.
    }
}
