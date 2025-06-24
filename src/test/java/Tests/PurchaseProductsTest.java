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
    public void clickAddToCart(){homePage.clickAddToCart();}

    @Test(dependsOnMethods = "clickAddToCart")
    public void clickAddToCart2(){homePage.clickAddToCart2();}

    @Test(dependsOnMethods = "clickAddToCart2")
    public void clickCart(){homePage.clickCart();}

    @Test(dependsOnMethods = "clickCart")
    public void verifyYourCartTitle(){cartPage.verifyYourCartTitle();}

    @Test(dependsOnMethods = "verifyYourCartTitle")
    public void clickCheckoutButton(){cartPage.clickCheckoutButton();}

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
