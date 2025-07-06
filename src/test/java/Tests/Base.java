package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("edge", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    AddedItems addedItems = PageFactory.initElements(driver, AddedItems.class);
    CheckOut checkOut = PageFactory.initElements(driver, CheckOut.class);
    CheckOutOverview checkOutOverViewPagePage = PageFactory.initElements(driver, CheckOutOverview.class);
    //CheckOutThankYouPage checkOutThankYouPage = PageFactory.initElements(driver, CheckOutThankYouPage.class);
    ReadFromFile readFromFile = new ReadFromFile();



}
