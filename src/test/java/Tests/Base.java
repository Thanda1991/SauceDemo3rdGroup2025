package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromFile;
import Utils.TakeScreenshot;
import Utils.TakeScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
    ReadFromFile readFromFile = new ReadFromFile();
    OverviewPage overviewPage = PageFactory.initElements(driver, OverviewPage.class);
    TakeScreenshot takeScreenshot = new TakeScreenshot();
    CompletePage completePage=PageFactory.initElements(driver, CompletePage.class);
}
