package Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {

    static WebDriver driver;

    public  WebDriver getDriver(){
        return  driver;
    }

    public static WebDriver startBrowser(String browserChoice, String url){
        if (browserChoice.equalsIgnoreCase("chrome")){

       /*     //set chrome preferences to block pop-ups
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("profile.default_content_setting_values.popups,", 2); // 2 = block

            //set the preferences in chrome options
            ChromeOptions Options = new ChromeOptions();
            Options.setExperimentalOption("prefs", prefs);
*/
          // Alert alertOk = driver.switchTo().alert();
           //alertOk.accept();

            driver = new ChromeDriver();

        } else if (browserChoice.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if (browserChoice.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

//    @Test
//    public void test(){
//        startBrowser("chrome", "https://www.saucedemo.com/");
//    }
}
