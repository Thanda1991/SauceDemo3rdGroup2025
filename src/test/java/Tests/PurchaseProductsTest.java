package Tests;

import Utils.ReadFromFile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PurchaseProductsTest extends Base {

    @Test(priority = 1)
    public void enterUsername() throws InterruptedException {
        // Step 1: Enter valid username on login page
        loginPage.enterUsername(ReadFromFile.username);
        Thread.sleep(1000);
    }

    @Test(priority = 2, dependsOnMethods = "enterUsername")
    public void enterPassword() throws InterruptedException {
        // Step 2: Enter password after username
        loginPage.enterPassword(ReadFromFile.password);
        takesScreenshots.takesScreenshot(driver,"LoginPage");
        Thread.sleep(1000);
    }

    @Test(priority = 3, dependsOnMethods = "enterPassword")
    public void clickLoginButton() throws InterruptedException {
        // Step 3: Click login and redirect to product listing
        loginPage.clickLoginButton();
        Thread.sleep(1000);
    }

    @Test(priority = 4, dependsOnMethods = "clickLoginButton")
    public void verifyProductTitle() throws InterruptedException {
        // Step 4: Confirm user is on products page
        homePage.verifyProductTitle();
        takesScreenshots.takesScreenshot(driver,"HomePage");
        Thread.sleep(1000);
    }

    @Test(priority = 5, dependsOnMethods = "verifyProductTitle")
    public void clickAddToCart() throws InterruptedException {
        // Step 5: Add item to cart and verify 'Remove' button appears
        homePage.ClickAddToCart();
        homePage.VerifyRemoveButton();
        takesScreenshots.takesScreenshot(driver,"HomePage");
        Thread.sleep(1000);
    }

    @Test(priority = 6, dependsOnMethods = "clickAddToCart")
    public void clickShoppingCart() throws InterruptedException {
        // Step 6: Go to the shopping cart page
        homePage.ClickShoppingCart();
        Thread.sleep(1000);
    }

    @Test(priority = 7, dependsOnMethods = "clickShoppingCart")
    public void clickCheckout() throws InterruptedException {
        // Step 7: Click checkout button, navigate to 'Your Information' page
        cartPage.clickCheckout();
        Thread.sleep(1000);
    }

    @Test(priority = 8, dependsOnMethods = "clickCheckout")
    public void verifyCheckoutTitle() throws InterruptedException {
        // Step 8: Verify checkout information page title
        checkoutPage.VerifyCheckoutTitle();
        takesScreenshots.takesScreenshot(driver,"checkoutPage");
        Thread.sleep(1000);
    }

    @Test(priority = 9, dependsOnMethods = "verifyCheckoutTitle")
    public void enterCheckoutInformation() throws InterruptedException {
        // Step 9: Fill in first name, last name, and postal code
        checkoutPage.enterFirstname(ReadFromFile.firstname);
        checkoutPage.enterLastname(ReadFromFile.lastname);
        checkoutPage.enterPostal(ReadFromFile.postalcode);
        Thread.sleep(1000);
    }

    @Test(priority = 10, dependsOnMethods = "enterCheckoutInformation")
    public void clickContinue() throws InterruptedException {
        // Step 10: Continue to the checkout overview page
        checkoutPage.ClickContinue();
        Thread.sleep(1000);
    }

    @Test(priority = 11, dependsOnMethods = "clickContinue")
    public void verifyCheckoutOverviewPage() throws InterruptedException {
        // Step 11: Verify 'Checkout: Overview' page is displayed
        checkoutoverviewPage.VerifyCheckoutOverviewTitle();
        takesScreenshots.takesScreenshot(driver,"checkoutoverviewPage");
        Thread.sleep(1000);
    }

    @Test(priority = 12, dependsOnMethods = "verifyCheckoutOverviewPage")
    public void clickFinish() throws InterruptedException {
        // Step 12: Complete the purchase
        checkoutoverviewPage.ClickFinishButton();
        Thread.sleep(1000);
    }

    @Test(priority = 13, dependsOnMethods = "clickFinish")
    public void verifyCheckoutComplete() throws InterruptedException {
        // Step 13: Confirm the order completion page is displayed
        checkoutcompletePage.VerifyCheckoutComplete();
        takesScreenshots.takesScreenshot(driver,"checkoutcompletePage");
        Thread.sleep(1000);
    }

    @Test(priority = 14, dependsOnMethods = "verifyCheckoutComplete")
    public void clickBackHome() throws InterruptedException {
        // Step 14: Click 'Back Home' to return to product listing
        checkoutcompletePage.clickBackHome();
        Thread.sleep(1000);
    }

    @Test(priority = 15, dependsOnMethods = "clickBackHome")
    public void verifyBackHome() throws InterruptedException {
        // Step 15: Verify navigation back to the products page
        homePage.verifyProductTitle();
        takesScreenshots.takesScreenshot(driver,"HomePage");
        Thread.sleep(1000);
    }

    @AfterTest
    public void closeBrowser() {
        // Final Step: Close the browser after ExtendReportManager completion
        driver.quit();
    }
}
