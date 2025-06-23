package Tests;

import Pages.HomePage;
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
    public void ClickAddToCart(){homePage.ClickAddToCart();}

    @Test(dependsOnMethods = "ClickAddToCart")
    public void ClickToCart(){homePage.ClickToCart();
    }
    @Test(dependsOnMethods = "ClickToCart")
    public void verifyCartTitle() {cartPage.verifyCartTitle();}

    @Test(dependsOnMethods = "verifyCartTitle")
    public void ClickCheckOutButton() {cartPage.ClickCheckOutButton();}

    @Test(dependsOnMethods = "verifyCartTitle")
    public void verifyYourInfoTittle(){yourInfomationPage.verifyYourInfoTittle();}

    @Test(dependsOnMethods = "ClickCheckOutButton")
    public void enterName(){yourInfomationPage.enterName("lada");}

    @Test(dependsOnMethods = "enterName")
    public void enterLasName(){yourInfomationPage.enterLasname("data");}

    @Test(dependsOnMethods = "enterLasName")
    public void EnterPostalCode(){yourInfomationPage.enterPostalCode("2123");}

    @Test(dependsOnMethods = "EnterPostalCode")
    public void ClickContinueButton() {yourInfomationPage.ClickContinueButton();}
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
