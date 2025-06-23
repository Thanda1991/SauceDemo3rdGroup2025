package Tests;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.YourInfomationPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CartPage cartPage =PageFactory.initElements(driver,CartPage.class);
    YourInfomationPage yourInfomationPage= PageFactory.initElements(driver, YourInfomationPage.class);
}
