package Tests;

import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CartPage CartPage = PageFactory.initElements(driver, CartPage.class);
    CheckOutPage CheckOutPage = PageFactory.initElements(driver, Pages.CheckOutPage.class);

}
