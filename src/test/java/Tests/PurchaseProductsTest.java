package Tests;

import net.bytebuddy.build.Plugin;
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
    public void clickAddToCart(){homePage.clickAddToCart();}

    @Test(dependsOnMethods = "clickAddToCart")
    public void clickCart(){homePage.clickCart();}

    @Test(dependsOnMethods = {"clickAddToCart", "clickCart"})
    public void clickCheckoutTests() throws InterruptedException {checkoutPage.clickCheckout();
    Thread.sleep(2000);}

    @Test(dependsOnMethods = "clickCheckoutTests")
    public void enterFirstName() {
        yourInfoPage.enterFirstName(readFromFile.firstName);
    }

    @Test(dependsOnMethods = "enterFirstName")
    public void enterLastName() {
        yourInfoPage.enterLastName(readFromFile.lastName);
    }

    @Test(dependsOnMethods = "enterLastName")
    public void enterPostalCode() {
        yourInfoPage.enterPostalCode(readFromFile.postalCode);
    }

    @Test(dependsOnMethods = "enterPostalCode")
    public void clickContinue() {
        yourInfoPage.clickContinue();
    }

 /*   @AfterTest
    public void closeBrowser() {
        driver.quit();
    } */
}
