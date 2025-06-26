package Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;

public class ReadFromFile {

    private static final String EXCEL_PATH = "data.xlsx";  // should be in src/test/resources
    private static XSSFWorkbook workbook;
    private static XSSFSheet loginSheet;
    private static XSSFSheet userDetailsSheet;

    public static String username;
    public static String password;
    public static String firstname;
    public static String lastname;
    public static String postalcode;

    static {
        try (InputStream is = ReadFromFile.class.getClassLoader().getResourceAsStream(EXCEL_PATH)) {
            if (is == null) {
                throw new RuntimeException("Could not find resource: " + EXCEL_PATH);
            }

            workbook = new XSSFWorkbook(is);
            loginSheet       = workbook.getSheet("login");
            userDetailsSheet = workbook.getSheet("User_details");

            username   = getCellValue(loginSheet.getRow(1).getCell(0));
            password   = getCellValue(loginSheet.getRow(1).getCell(1));
            firstname  = getCellValue(userDetailsSheet.getRow(1).getCell(0));
            lastname   = getCellValue(userDetailsSheet.getRow(1).getCell(1));
            postalcode = getCellValue(userDetailsSheet.getRow(1).getCell(2));

        } catch (IOException e) {
            throw new RuntimeException("Failed to load Excel from resources: " + EXCEL_PATH, e);
        }
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) return "";
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf((long) cell.getNumericCellValue()); // Avoid ".0" for integers
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            case BLANK:
                return "";
            default:
                return "";
        }
    }
}
