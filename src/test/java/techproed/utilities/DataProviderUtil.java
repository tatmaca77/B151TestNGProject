package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {

    @DataProvider
    public static Object[][] sehirVerileri() {
        return new Object[][]{{"Ankara","IcAnadolu","06"},{"Izmir","Ege","35"},{"Diyarbakır","Doğu","21"}};
    }
}
