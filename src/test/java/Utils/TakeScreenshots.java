package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshots {

    private static String ScreenshotDirectory = System.getProperty("user.dir") + "/src/test/java/Screenshots/";

    public void takeScreenshot(WebDriver driver, String screenshotName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(ScreenshotDirectory + "/" + screenshotName + ".png");
        try {
            FileUtils.copyFile(src, destination);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
