package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static Utils.BrowserFactory.driver;

public class TakeScreenshot {
    private static String ScreenshortPath = System.getProperty("user.dir") + "/Screenshorts/";

    public void TakeScreenshot(WebDriver driver, String screenshotName) {

        TakeScreenshot takeScreanshort = (TakeScreenshot) driver;
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(ScreenshortPath + screenshotName + ".png");
        try {
            FileUtils.copyFile(src, dest);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Screenshot taken: " + dest.getAbsolutePath());
    }
}


