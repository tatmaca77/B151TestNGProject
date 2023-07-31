package techproed.tests.day30_Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_ListenersTest02 {

    @Test
    public void test01() {
        System.out.println("PASSED");
        Assert.assertTrue(true);
        Assert.assertEquals(2,2);
    }

    @Test
    public void test02() {
        System.out.println("FAILED");
        Assert.assertTrue(false);   // Ekran Resmi almak icinde browser acilmis olur ve bos sayfa ss alir.
    }

    @Test
    public void test03() {
        System.out.println("SKIP");
        throw new SkipException("Bu method atlandi.");  // Bir test'i skip yani atlatmak istersem bu sekilde olabilir.

    }

    @Test
    public void test04() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().findElement(By.id("sdvdsvdfv")).click();
    }




}
