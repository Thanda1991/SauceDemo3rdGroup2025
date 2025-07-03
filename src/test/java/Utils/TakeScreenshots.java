package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshots {

    private static String ScreenshotDir = System.getProperty("user.dir") + "/screenshots/";

    public void takeScreenshot(WebDriver driver, String screenshotName) {
        TakeScreenshots takeScreenshots = (TakeScreenshots) driver;
        File src = takeScreenshots.getScreenshotAs(OutputType.FILE);
        File destination = new File(ScreenshotDir ,screenshotName + ".png");
        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private File getScreenshotAs(OutputType<File> file) {

        return null; // This method should return a File object representing the screenshot
    }

}
