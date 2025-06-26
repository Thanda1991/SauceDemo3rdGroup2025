package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("firefox", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
    CheckoutStepOnePage checkoutStepOnePage = PageFactory.initElements(driver, CheckoutStepOnePage.class);
    CheckoutStepTwoPage checkoutStepTwoPage = PageFactory.initElements(driver, CheckoutStepTwoPage.class);
    CheckoutCompletePage checkoutCompletePage = PageFactory.initElements(driver, CheckoutCompletePage.class);
    ReadFromFile readFromFile = new ReadFromFile();
}
