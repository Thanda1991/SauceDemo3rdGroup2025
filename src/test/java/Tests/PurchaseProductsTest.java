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

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
