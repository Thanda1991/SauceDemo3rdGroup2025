package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromFile {

    private static String testData = System.getProperty("user.dir") +"/src/test/java/TestData/data.xlsx";

    static FileInputStream fs;

    static {
        try {
            fs = new FileInputStream(testData);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static XSSFWorkbook workbook;

    static {
        try {
            workbook = new XSSFWorkbook(fs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static XSSFSheet sheet = workbook.getSheet("login");
    static XSSFSheet sheet2 = workbook.getSheet("user_details");

    public static String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public static String password = sheet.getRow(1).getCell(1).getStringCellValue();

    public static String first_name = sheet2.getRow(2).getCell(0).getStringCellValue();
    public static String sname = sheet2.getRow(2).getCell(1).getStringCellValue();
    public static String postalCode = sheet2.getRow(2).getCell(2).getStringCellValue();
//    @Test
//    public  void test(){
//        System.out.println("first name is: "+first_name);
//        System.out.println("Surname name is: "+sname);
//        System.out.println("Postal code is: "+postalCode);
//    }
}
