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
    public void addToCart(){homePage.addToCart_id();}


    @Test(dependsOnMethods = "addToCart")
    public void shoppingCart(){homePage.setShoppingCart_id();}

    @Test(dependsOnMethods ="shoppingCart")
    public void checkout(){CartPage.checkout_id();}

    @Test(dependsOnMethods = "checkout")
    public void enterFirstname(){
        CheckOutPage.enterFirstname("Refilwe");}

    @Test(dependsOnMethods = "enterFirstname")
    public void enterLastname(){CheckOutPage.enterLastname("Mahlehla");}

    @Test(dependsOnMethods = "enterLastName")
    public void enterPostalcode(){CheckOutPage.enterPostalcode("0008");}
    }



