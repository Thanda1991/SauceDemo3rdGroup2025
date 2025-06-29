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

    //@Test(priority = 2)
    @Test(dependsOnMethods = "enterUsername")
    public void enterPassword(){loginPage.enterPassword("secret_sauce");
    }

    //@Test(priority = 3)
    @Test(dependsOnMethods = "enterPassword")
    public void clickLoginButton(){loginPage.clickLoginButton();
    }

    //@Test(priority = 4)
    @Test(dependsOnMethods = "clickLoginButton")
    public void verifyProductTitle() {
        homePage.verifyProductTitle();
    }

//    //@Test(priority = 5)
    @Test(dependsOnMethods = "verifyProductTitle")
    public void clickAddToCart(){homePage.clickAddToCart();}

//    //@Test(priority = 6)
    @Test(dependsOnMethods = "clickAddToCart")
    public void verifyCartTitle(){myCartView.verifyCartTitle();}

//    //@Test(priority = 7)
    @Test(dependsOnMethods = "verifyCartTitle")
    public void goToCart(){homePage.ClickCart();}

    @Test(dependsOnMethods = "goToCart")
    public void clickCheckoutButton(){myCartView.clickCheckoutButton();}

//    //@Test(priority = 9)
    @Test(dependsOnMethods = "clickCheckoutButton")
    public void verifyCheckoutTitle1() { checkoutInfo.verifyCheckoutTitle();
    }


//    //@Test(priority = 10)
//    @Test(dependsOnMethods = "verifyCheckoutTitle1")
//    public void enterFirstName(){checkoutInfo.enterFirstName("Lance");
//    }
//
//    @Test(dependsOnMethods = "enterFirstName")
//    //@Test(priority = 11)
//    public void enterLastname(){
//        checkoutInfo.enterLastname("Mkansi");
//    }
//
//    @Test(dependsOnMethods = "enterLastname")
//    //@Test(priority = 12)
//    public void enterPostalCode(){
//        checkoutInfo.enterPostalCode("0011");
//    }
//
//    //@Test(priority = 13)
//    @Test(dependsOnMethods = "enterPostalCode")
//    public void clickCheckoutButton(){
//        checkoutInfo.clickContinueBtn();
//    }
//
//    public void verifyCheckoutTitle()
//    {
//        checkoutOverview.verifyCheckoutTitle();
//    }
//    public void clickFinishCheckoutButton(){
//        checkoutOverview.clickFinishCheckoutButton();
//    }
//
//    public void verifyCompletionHeader(){
//        checkoutCompletion.verifyCompletionHeader();
//    }
//    public void clickBurgerMenu(){
//        checkoutCompletion.clickBurgerMenu();
//    }
//    public void clickLogoutLink(){
//        checkoutCompletion.clickLogoutLink();
//    }

//    @AfterTest
//    public void closeBrowser() {
//        driver.quit();
//    }
}
