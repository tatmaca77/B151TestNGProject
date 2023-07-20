package techproed.tests.day27_SmokeTest_Excel;

import org.testng.annotations.Test;
import techproed.utilities.ExcelReader;

public class C03_BlueRentalExcelTest {


    @Test
    public void test01() {
        // mysmoketestdata excel dosyasindaki 1.satir bilgilerini konsola yazdirin
        String filePath = "src/test/java/techproed/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";

        ExcelReader reader = new ExcelReader(filePath,sheetName);



    }
}
