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
    static XSSFSheet sheet2 = workbook.getSheet("User_details");

    public static String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public static String password = sheet.getRow(1).getCell(1).getStringCellValue();
    public static String firstName = sheet2.getRow(1).getCell(0).getStringCellValue();
    public static String lastName = sheet2.getRow(1).getCell(1).getStringCellValue();
    public static String postalCode = sheet2.getRow(1).getCell(2).getStringCellValue();

    @Test
    public void test(){
        System.out.println("Username is "+username);
        System.out.println("Password is "+password);
        System.out.println("FirstName is "+firstName);
        System.out.println("LastName is  "+lastName);
        System.out.println("PostalCode is "+postalCode);
    }

}
