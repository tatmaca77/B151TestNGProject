package techproed.tests.day28_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C06_DataProviderTest {

    /**
    dataProvider'i database veya excel gibi dusunebiliriz. Eger elimizde az miktarda veri varsa  bunu kullanabiliriz.
    Istersek 10 tane test methodu olusturup burdan istedigimiz veriyi cekip kullanabiliriz.
     */


    @DataProvider
    public static Object[][] veriler() {
        return new Object[][]{{"esen"},
                {"mehmet"},
                {"esma"},
                {"tolgahan"},
                {"mert"},
                {"burcu"},
                {"yunus"}};
    }

    @Test(dataProvider = "veriler")
    public void test01(String data) {
        System.out.println(data);


    }

    @Test(dataProvider = "veriler")
    public void test02(String isim) {
        System.out.println(isim);



    }

    @Test(dataProvider = "veriler")
    public void test03(String name) {
        System.out.println(name);




    }

    @Test(dataProvider = "veriler")
    public void test04(String ad) {
        System.out.println(ad);



    }
}
