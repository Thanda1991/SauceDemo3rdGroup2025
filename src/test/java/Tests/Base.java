package Tests;

import Pages.LoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver= browserFactory.startBrowser("chrome","https://www.saucedemo.com/");

    //this line gives us access to all the methods in the base class
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
}
