package Tests;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseProductsTest extends Base{

    public void enterUsername(){
        loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsername")
    //@Test(priority = 1)
    public void enterPassword(){
        loginPage.enterPassword("secret_sauce");
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
    public void AddItemToCart() {
        homePage.clickAddToCart();
    }
    @Test(dependsOnMethods = "AddItemToCart")
    public void ClickOnCartIcon() {
        homePage.ClickCart();
    }
    @Test(dependsOnMethods = "ClickOnCartIcon")
    public void verifyYourCartTitleLabel() {
        cartPage.verifyYourCartTitle();
    }
    @Test(dependsOnMethods = "verifyYourCartTitleLabel")
    public void ClickOnCheckoutButton() {
        cartPage.clickOnCheckoutButton();
    }
    @Test(dependsOnMethods = "ClickOnCheckoutButton")
    public void enterFirstName(){
        checkoutPage.enterFirstname("MyFirstName");
    }
    @Test(dependsOnMethods = "enterFirstName")
    public void enterLastName(){
        checkoutPage.enterLastName("MyLastName");
    }
    @Test(dependsOnMethods = "enterLastName")
    public void enterPostalCode(){
        checkoutPage.enterPostalCode("2194");
    }
    @Test(dependsOnMethods = "enterPostalCode")
    public void clickContinueButton(){
        checkoutPage.clickContinueButton();
    }

    @Test(dependsOnMethods = "clickContinueButton")
    public void verifyCheckoutOverviewTitle(){
        checkoutPage.verifyCheckoutOverviewTitle();
    }

    @Test(dependsOnMethods = "verifyCheckoutOverviewTitle")
    public void clickFinishButton(){
        checkoutPage.clickFinishButton();
    }
    @Test(dependsOnMethods = "clickFinishButton")
    public void verifyCheckoutCompleteTitle(){
        thankYouPage.verifyCheckoutCompleteTitle();
    }
    @Test(dependsOnMethods = "verifyCheckoutCompleteTitle")
    public void verifyCheckoutThankYouMessage(){
        thankYouPage.verifyCheckoutThankYouMessage();
    }
    @Test(dependsOnMethods = "verifyCheckoutThankYouMessage")
    public void clickBurgerMenu(){
        thankYouPage.clickBurgerMenu();
    }
    @Test(dependsOnMethods = "clickBurgerMenu")
    public void clickLogoutButton(){
        thankYouPage.clickLogoutButton();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
