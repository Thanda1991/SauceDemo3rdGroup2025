package Tests;

import Pages.CartPage;
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
    public void ClickCart(){homePage.ClickCart();}

//    @Test(dependsOnMethods = "ClickCart")
//     public  void VerifyCartTittle(){cartPage.VerifyCartTittle();}

    @Test(dependsOnMethods = "clickAddToCart")
    public void clickCheckOut(){cartPage.clickCheckOut();}

    @Test(dependsOnMethods = "clickCheckOut")
    public void EnterFirstname(){yourInformationPage.EnterFirstname("dudu");}

    @Test(dependsOnMethods = "EnterFirstname")
    public void EnterLastname (){yourInformationPage.EnterLastname("Meli");}

    @Test(dependsOnMethods = "EnterLastname")
     public void EnterPostaladdress(){yourInformationPage.EnterPostaladdress("6789");}
   @Test(dependsOnMethods = "EnterPostaladdress")
   public  void ClickContinuebtn(){yourInformationPage.ClickContinuebtn();}

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
