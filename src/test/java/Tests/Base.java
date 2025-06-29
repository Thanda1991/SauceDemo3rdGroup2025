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
    MyCartView myCartView = PageFactory.initElements(driver, MyCartView.class);
    CheckoutInfo checkoutInfo = PageFactory.initElements(driver, CheckoutInfo.class );
    CheckoutOverview checkoutOverview = PageFactory.initElements(driver, CheckoutOverview.class);
    ReadFromFile readFromFile = new ReadFromFile();

}
