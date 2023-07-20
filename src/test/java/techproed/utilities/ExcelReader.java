package techproed.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    //constructordan obje olurtururken 2 parametre girdik, biri dosya yolu digeri sayfa ismi
    //Constructor class ismi ile aynı olur ve büyük harfle başlar.

    Workbook workbook;
    Sheet sheet;
    public ExcelReader(String filePath, String sheetName){
        try {
            FileInputStream fis = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fis);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Satir ve Sütun saysilarini girdigimde, o hücredeki veriyi return eder.
    public String getCellData(int satir, int sutun){
        Cell cell = sheet.getRow(satir).getCell(sutun);
        return cell.toString();
    }

    // Excel'deki satir sayisini return eder
    public int rowCount() {
    return sheet.getLastRowNum();
    }


}
