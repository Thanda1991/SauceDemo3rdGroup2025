package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseProductsTest extends Base {

    //@Test(priority = 1)
    @Test
    public void enterUsername() {
        loginPage.enterUsername(readFromFile.username);
    }

    //@Test(priority = 2)
    @Test(dependsOnMethods = "enterUsername")
    public void enterPassword() {
        loginPage.enterPassword(readFromFile.password);
    }

    //@Test(priority = 3)
    @Test(dependsOnMethods = "enterPassword")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    //@Test(priority = 4)
    @Test(dependsOnMethods = "clickLoginButton")
    public void verifyProductTitle() {
        homePage.verifyProductTitle();
    }

    //    //@Test(priority = 5)
    @Test(dependsOnMethods = "verifyProductTitle")
    public void clickAddToCart() {
        homePage.clickAddToCart();
    }

    //    //@Test(priority = 6)
    @Test(dependsOnMethods = "clickAddToCart")
    public void verifyCartTitle() {
        myCartView.verifyCartTitle();
    }

    //    //@Test(priority = 7)
    @Test(dependsOnMethods = "verifyCartTitle")
    public void goToCart() {
        homePage.ClickCart();
    }

    @Test(dependsOnMethods = "goToCart")
    public void clickCheckoutButton() {
        myCartView.clickCheckoutButton();
    }

    @Test(dependsOnMethods = "clickCheckoutButton")
    public void enterFirstName() {
        checkoutInfo.enterFirstName(readFromFile.firstname);
    }


    @Test(dependsOnMethods = "enterFirstName")
    public void enterLastname() {
        checkoutInfo.enterLastname(readFromFile.lastname);
    }

    @Test(dependsOnMethods = "enterLastname")
    public void enterPostalCode() {
        checkoutInfo.enterPostalCode(readFromFile.postalcode);
    }

    @Test(dependsOnMethods = "enterPostalCode")
    public void clickContinueBtn() {
        checkoutInfo.clickContinueBtn();
    }

    @Test(dependsOnMethods = "clickContinueBtn")
    public void verifyOverviewTitle() {
        checkoutOverview.verifyOverviewTitle();
    }

    @Test(dependsOnMethods = "verifyOverviewTitle")
    public void clickFinishCheckoutButton() {
        checkoutOverview.clickFinishCheckoutButton();
    }

    @Test(dependsOnMethods = "clickFinishCheckoutButton")
    public void verifyCompletionHeader() {
        logoutFromSwag.verifyCompletionHeader();
    }

    @Test(dependsOnMethods = "verifyCompletionHeader")
    public void clickBurgerMenu() {
        logoutFromSwag.clickBurgerMenu();
    }

    @Test(dependsOnMethods = "clickBurgerMenu")
    public void clickLogoutLink() {
        logoutFromSwag.clickLogoutLink();
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
