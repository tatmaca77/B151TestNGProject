package techproed.tests.day27_SmokeTest_Excel;


import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;

/**
Bu Tarz bir soruyla karsilasabiliriz... !!!!
 //Excel dosyamızdaki tüm email ve password'ler ile
 //BlueRentalCar sayfasına gidip login olalım
 */

public class C04_BlueRentalExcelTest {


    @Test
    public void test01() {

        String filePath = "src/test/java/techproed/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";
        ExcelReader reader = new ExcelReader(filePath,sheetName);

        //Excel dosyamızdaki tüm email ve password'ler ile
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));


        // Bir loop olusturup excel dosyasindaki tüm veriler ile login olalim ( i => 1'den baslar )
        for (int i = 1; i <= reader.rowCount() ; i++) {// i -> 1'den baslar, cünkü veriler 1.satirdan baslar
            String email = reader.getCellData(i,0);
            String password = reader.getCellData(i,1);
            System.out.println(email + " ==> " + password);

        }







    }
}
