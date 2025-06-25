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
    public void ClickCart(){homePage.ClickCart();}

    @Test(dependsOnMethods = {"clickAddToCart", "ClickCart"})
    public void clickCheckoutTests() throws InterruptedException {checkoutPage.clickCheckout();
    Thread.sleep(2000);}

    @Test(dependsOnMethods = "clickCheckoutTests")
    public void enterFirstName(){ infoPage.enterFirstName(readFromFile.firstName);}

    @Test (dependsOnMethods = "enterFirstName")
    public void enterLastName() throws InterruptedException {infoPage.enterLastName(readFromFile.lastName);
    Thread.sleep(2000);
    }



    @Test (dependsOnMethods = "enterLastName")
    public void enterPostalCode() throws InterruptedException {infoPage.enterPostalCode(readFromFile.postalCode);
        Thread.sleep(2000);

    }

    @Test (dependsOnMethods = "enterPostalCode")
    public void clickContinue() throws InterruptedException {infoPage.clickContinue();
        Thread.sleep(2000);}



    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}
