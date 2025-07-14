package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.HighlightElements;
import Utils.ReadFromFile;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class Base {
//use protected access modifier to allow subclasses to access these fields directly
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected CartPage cartPage;
    protected CheckoutPage checkoutPage;
    protected CheckoutOverviewPage checkoutoverviewPage;
    protected CheckoutCompletePage checkoutcompletePage;

    protected ReadFromFile readFromFile;
    protected TakesScreenshots takesScreenshots;
    protected HighlightElements highlightElements;

    @BeforeClass
    public void setUp() {
        // 1) Start browser and navigate
        driver = BrowserFactory.startBrowser("Edge", "http://www.saucedemo.com/");

        // 2) Initialize Page Objects
        loginPage               = PageFactory.initElements(driver, LoginPage.class);
        homePage                = PageFactory.initElements(driver, HomePage.class);
        cartPage                = PageFactory.initElements(driver, CartPage.class);
        checkoutPage            = PageFactory.initElements(driver, CheckoutPage.class);
        checkoutoverviewPage   = PageFactory.initElements(driver, CheckoutOverviewPage.class);
        checkoutcompletePage   = PageFactory.initElements(driver, CheckoutCompletePage.class);

// 3) Initialize utility classes
        readFromFile    = new ReadFromFile();
        takesScreenshots = new TakesScreenshots();
        highlightElements = new HighlightElements();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
