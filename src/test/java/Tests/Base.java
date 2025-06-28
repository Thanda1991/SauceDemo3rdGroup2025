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
    AddedItems addedItems = PageFactory.initElements(driver, AddedItems.class);
    CheckOut checkOut = PageFactory.initElements(driver, CheckOut.class);
    ReadFromFile readFromFile = new ReadFromFile();
    CheckOutOverview checkoutoverView = PageFactory.initElements(driver,CheckOutOverview.class);

}
