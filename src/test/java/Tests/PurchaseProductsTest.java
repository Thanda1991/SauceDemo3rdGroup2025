package Tests;

import Pages.CheckoutStepOnePage;
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

    @Test(dependsOnMethods = "verifyProductTitle")
    public void addProductToCart()
    {
        homePage.clickAddToCart();
    }

    @Test(dependsOnMethods = "addProductToCart")
    public void verifyProductSelection(){
        homePage.verifyProductSelection();
    }

    @Test(dependsOnMethods = "verifyProductSelection")
    public void clickCart(){
        homePage.navigateToCart();
    }

    @Test(dependsOnMethods = "clickCart")
    public void verifyRemoveButtonOnCheckout(){
        cartPage.verifyRemoveButton();
    }

    @Test(dependsOnMethods = "verifyRemoveButtonOnCheckout")
    public void clickCheckoutButton() throws InterruptedException {
        Thread.sleep(1000);
        cartPage.clickCheckoutButton();
    }

    @Test(dependsOnMethods = "clickCheckoutButton")
    public void verifyCheckoutTitle(){
        checkoutStepOnePage.verifyCheckoutTitle();
    }

    @Test(dependsOnMethods = "verifyCheckoutTitle")
    public void enterFirstName(){
        checkoutStepOnePage.enterFirstName(readFromFile.firstName);
    }

    @Test(dependsOnMethods = "enterFirstName")
    public void enterLastName(){
        checkoutStepOnePage.enterLastName(readFromFile.lastName);
    }

    @Test(dependsOnMethods = "enterLastName")
    public void enterPostalCode(){
        checkoutStepOnePage.enterPostalCode(readFromFile.postalCode);
    }

    @Test(dependsOnMethods = "enterPostalCode")
    public void clickContinueButton(){
        checkoutStepOnePage.clickContinueButton();
    }

    @Test(dependsOnMethods = "clickContinueButton")
    public void verifyCheckoutTitlePageTwo(){
        checkoutStepTwoPage.VerifyCheckoutTitlePageTwo();
    }

    @Test(dependsOnMethods = "verifyCheckoutTitlePageTwo")
    public void clickFinishButton(){
        checkoutStepTwoPage.clickFinishButton();
    }

    @Test(dependsOnMethods = "clickFinishButton")
    public void verifyOrderConfirmationTitle(){
        checkoutCompletePage.verifyOrderConfirmationTitle();
    }

    @Test(dependsOnMethods = "verifyOrderConfirmationTitle")
    public void clickBackToProductsButton(){
        checkoutCompletePage.clickBackButton();
    }

    @Test(dependsOnMethods = "clickBackToProductsButton")
    public void clickBurgerMenuButton(){
        homePage.clickBurgerMenuButton();
    }

    @Test(dependsOnMethods = "clickBurgerMenuButton")
    public void clickLogoutLink(){
        homePage.clickLogoutLink();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
