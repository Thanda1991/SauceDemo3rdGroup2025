package Tests;

import Pages.*;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
    InformationPage informationPage = PageFactory.initElements(driver, InformationPage.class);
    CheckOutPage checkOutPage = PageFactory.initElements(driver, CheckOutPage.class);
    CompletePage completePage = PageFactory.initElements(driver, CompletePage.class);
}
