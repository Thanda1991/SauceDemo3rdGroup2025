package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromFile;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("edge", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
    CheckOutInformationPage checkOutInformationPage = PageFactory.initElements(driver, CheckOutInformationPage.class);
    CheckOutOverViewPage checkOutOverViewPagePage = PageFactory.initElements(driver, CheckOutOverViewPage.class);
    CheckOutThankYouPage checkOutThankYouPage = PageFactory.initElements(driver, CheckOutThankYouPage.class);
    ReadFromFile readFromFile = new ReadFromFile();
    TakesScreenshots takesScreenshots = new TakesScreenshots ();



}
