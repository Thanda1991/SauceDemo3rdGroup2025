package Tests;

import Utils.TakeScreenshot;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseProductsTest extends Base{

    public void enterUsername(){
        loginPage.enterUsername(readFromFile.username);

    }

    @Test(dependsOnMethods = "enterUsername")
    //@Test(priority = 1)
    public void enterPassword(){
        loginPage.enterPassword(readFromFile.password);
        takeScreenshot.takesScreenshot(driver, "loginPage");
    }

    //@Test(priority = 2)
    @Test(dependsOnMethods = "enterPassword")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void verifyProductTitle() {
        homePage.verifyProductTitle();
    }

    @Test (dependsOnMethods = "verifyProductTitle")
    public void clickAddToCart(){homePage.clickAddToCart();
    takeScreenshot.takesScreenshot(driver, "HomePage");
    }


    @Test(dependsOnMethods = "clickAddToCart")
    public void ClickCart(){homePage.ClickCart();}

    @Test(dependsOnMethods = {"clickAddToCart", "ClickCart"})
    public void clickCheckoutTests() throws InterruptedException {checkoutPage.clickCheckout();
    Thread.sleep(2000);}
    @Test(dependsOnMethods = "clickCheckoutTests")
    public void enterFirstName() throws InterruptedException {
        checkoutPage.enterFirstName(readFromFile.FirstName);
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = "enterFirstName")
    public void enterLastName() {
        checkoutPage.enterLastName(readFromFile.LastName);

    }
    @Test(dependsOnMethods = "enterLastName")
    public void enterPostalCode() {
        checkoutPage.enterPostalCode(readFromFile.PostalCode);
        takeScreenshot.takesScreenshot(driver,"CheckoutPage");
    }
    @Test(dependsOnMethods = "enterPostalCode")
    public  void  ClickContinue() {
        checkoutPage.clickContinue();
    }
    @Test(dependsOnMethods = "ClickContinue")
    public void verifyOverviewTitle() {
        overviewPage.verifyoverviewTitle();
        takeScreenshot.takesScreenshot(driver,"OverviewPage");
    }
    @Test(dependsOnMethods = "verifyOverviewTitle")
    public void ClickFinishButton() {
        overviewPage.ClickfinishButton();
    }
    @Test(dependsOnMethods = "ClickFinishButton")
    public void VerifyCompleteTitle() {
        completePage.VerifyCompleteTitle();
        takeScreenshot.takesScreenshot(driver, "CompletePage");
    }
    @Test(dependsOnMethods = "VerifyCompleteTitle")
    public  void ClickBackToProducts() {
        completePage.clickBackToProducts();
    }
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
