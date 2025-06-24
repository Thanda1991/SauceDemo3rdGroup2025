package Tests;

import Pages.AddedItems;
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

    //@Test(Priority = 3) //Adding the item to the card
    @Test(dependsOnMethods = "clickAddToCart")
    public void clickAddToCart() { homePage.clickAddToCart();}

    //@Test(Priority = 4) //Verify the Added items
    @Test(dependsOnMethods = "Items added")
    public void verifyAddedItems() { addedItems.verifyAddedItems();   }

    //@Test(Priority= 5) ////Click the CART button
    @Test(dependsOnMethods = "ClickCart")
    public void ClickCart(){ homePage.ClickCart();}

    //@Test(Priority = 6)
    @Test(dependsOnMethods = "CheckoutAddedItems")
    public  void CheckoutAddedItems(){addedItems.CheckoutAddedItems(); }

    @Test(dependsOnMethods = "checkOut")
    public void checkOut(){checkOut.verifycheckoutDetails();}



    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
