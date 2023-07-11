package techproed.tests.day24_Priority_DependsOnMethods_SoftAssert;

import org.testng.annotations.Test;

public class C05_DependsOnMethods {

    @Test
    public void test01() {
        System.out.println("tolgahan");
    }
    @Test(dependsOnMethods = "test01")
    public void test02() {
        System.out.println("atmaca");
    }
    @Test(dependsOnMethods = "test02")
    public void test03() {
        System.out.println("selo");
    }
    @Test(dependsOnMethods = "test03")
    public void test04() {
        System.out.println("aysem");
    }

    /**
    Burda Class seviyesinde calistirmamiz gerekecektir. O sekilde bütün test methodlari calismis olacaktir. Sadece
    test seviyesinde calistirisak calistirdigimiz test ve bagli oldugu test methodölari calisir.
    Ancak bu örnekteki gibi test04 methodunun baglilik iliskisi olmadigi icin o calismaz ve hata verir.
     */
}
