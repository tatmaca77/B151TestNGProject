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
}
