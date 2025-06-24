package Tests;

import Pages.*;
import Utils.BrowserFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
    CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);

    CheckoutOverviewPage checkoutoverviewPage = PageFactory.initElements(driver, CheckoutOverviewPage.class);

    CheckoutCompletePage checkoutcompletePage = PageFactory.initElements(driver, CheckoutCompletePage.class);




}
