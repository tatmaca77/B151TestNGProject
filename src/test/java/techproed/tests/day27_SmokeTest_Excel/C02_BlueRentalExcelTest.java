package techproed.tests.day27_SmokeTest_Excel;

import org.testng.annotations.Test;
import techproed.utilities.ExcelReader;

public class C02_BlueRentalExcelTest {


    @Test
    public void test01() {
        // mysmoketestdata excel dosyasindaki 1.satir bilgilerini konsola yazdirin
        String filePath = "src/test/java/techproed/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";

        ExcelReader reader = new ExcelReader(filePath,sheetName);
        System.out.println("Birinci Email = " + reader.getCellData(1, 0));  // E-mail bilgisini verir
        System.out.println("Birinci Password = " + reader.getCellData(1, 1));  // Password bilgisini verir

    }
}
