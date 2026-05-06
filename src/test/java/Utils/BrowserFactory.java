package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    static WebDriver driver;

    //public  WebDriver getDriver(){
    //    return  driver;
    //}

    public static WebDriver startBrowser(String browserChoice, String url){
        switch(browserChoice.toLowerCase()){
            case "chrome":
                //ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new SafariDriver();
                break;

        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}
