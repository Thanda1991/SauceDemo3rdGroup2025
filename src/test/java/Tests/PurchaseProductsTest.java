package Tests;

import Pages.CheckOutPage;
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
    public void clickAddToCart()
    {
        homePage.clickAddToCart();
    }

    @Test(dependsOnMethods = "clickAddToCart")
    public void ClickCart()
    {
        homePage.ClickCart();
    }

    @Test(dependsOnMethods = "ClickCart")
    public void verifyCartTitle()
    {
        cartPage.verifyCartTitle();
    }

    @Test(dependsOnMethods = "verifyCartTitle")
    public void clickCheckOut()
    {
        cartPage.clickCheckOut();
    }

   @Test(dependsOnMethods = "clickCheckOut")
    public void verifyInformationTitle()
    {
        informationPage.verifyInformationTitle();

    }

    @Test(dependsOnMethods = "verifyInformationTitle")
    public void firstName()
    {
        informationPage.firstName();
    }

    @Test(dependsOnMethods = "firstName")
    public void lastName()
    {
        informationPage.lastName();
    }

    @Test(dependsOnMethods = "lastName")
    public void postalCode()
    {
        informationPage.postalCode();
    }

    @Test(dependsOnMethods = "postalCode")
    public void continue_id()
    {
        informationPage.continue_id();
    }

    @Test(dependsOnMethods = "continue_id")
    public void verifyCheckoutTitle()
    {
        checkOutPage.verifyCheckoutTitle();
    }

    @Test(dependsOnMethods = "verifyCheckoutTitle")
    public void finishButton()
    {
        checkOutPage.finishButton();
    }

    @Test(dependsOnMethods = "finishButton")
    public void verifyCompleteCheckOut()
    {
        completePage.verifyCompleteCheckOut();
    }

    @Test(dependsOnMethods = "verifyCompleteCheckOut")
    public void backToProductButton()
    {
        completePage.backToProductButton();
    }

    @Test(dependsOnMethods = "backToProductButton")
    public void BurgerMenu()
    {
        homePage.BurgerMenu();
    }

    @Test(dependsOnMethods = "BurgerMenu")
    public void Logout()
    {
        homePage.Logout();
    }


    /*@AfterTest
    public void closeBrowser() {
        driver.quit();
    }*/
}
