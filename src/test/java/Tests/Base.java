package Tests;

import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.YourInfoPage;
import Utils.BrowserFactory;
import Utils.ReadFromFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
    ReadFromFile readFromFile = new ReadFromFile();
    YourInfoPage yourInfoPage = PageFactory.initElements(driver, YourInfoPage.class);
}
