package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakesScreenshots {
    private static String ScreenshotDir = System.getProperty("user.dir") + "/Screenshots/";

    public void takesScreenshot(WebDriver driver, String screenshotName){
        TakesScreenshot  takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(ScreenshotDir, screenshotName + ".png");
        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
