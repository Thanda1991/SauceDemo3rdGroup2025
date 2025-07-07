package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
    CheckoutPage checkOutpage = PageFactory.initElements(driver, CheckoutPage.class);
    CheckoutOverview checkOutOverViewPagePage = PageFactory.initElements(driver, CheckoutOverview.class);
    ThankyouPage checkOutThankYouPage = PageFactory.initElements(driver, ThankyouPage.class);
    VatCalc vatCalcPage = PageFactory.initElements(driver,VatCalc.class);
    ReadFromFile readFromFile = new ReadFromFile();

}
