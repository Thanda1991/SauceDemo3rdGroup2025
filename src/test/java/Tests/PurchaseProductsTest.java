package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseProductsTest extends Base{

    //@Test(priority = 1)
    @Test
    public void enterUsername(){
        loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsername")
    //@Test(priority = 2)
    public void enterPassword(){
        loginPage.enterPassword("secret_sauce");
    }

    //@Test(priority = 3)
    @Test(dependsOnMethods = "enterPassword")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void verifyProductTitle() {
        homePage.verifyProductTitle();
    }

    @Test(dependsOnMethods = "clickAddToCart")
    public void clickAddToCart(){homePage.clickAddToCart();}

    @Test(dependsOnMethods = "my Cart")
    public void verifyCartTitle(){
        myCartView.verifyCartTitle();}

    @Test(dependsOnMethods = "Checkout button")
    public void clickCheckoutButton1(){myCartView.clickCheckoutButton();}

    public void verifyCheckoutTitle1() {

        checkoutInfo.verifyCheckoutTitle();
    }

    @Test(dependsOnMethods = "enterFirstName")
    //@Test(priority = 1)
    public void enterFirstName(){
        checkoutInfo.enterFirstName("Lence");
    }
    @Test(dependsOnMethods = "enterLastname")
    //@Test(priority = 2)
    public void enterLastname(){
        checkoutInfo.enterLastname("Mkansi");
    }
    @Test(dependsOnMethods = "enterPostalCode")
    //@Test(priority = 3)
    public void enterPostalCode(){
        checkoutInfo.enterPostalCode("0011");
    }
    @Test(dependsOnMethods = "enterPostalCode")
    public void clickCheckoutButton(){
        checkoutInfo.clickContinueBtn();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
