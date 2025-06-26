package Tests;

import Pages.AddedItems;
import Pages.CheckOut;
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
    //@Test(dependsOnMethods = "clickAddToCart")
    @Test(dependsOnMethods = "verifyProductTitle")
    public void clickAddToCart() { homePage.clickAddToCart();}

//    @Test(dependsOnMethods = "ClickCart")
    @Test(dependsOnMethods = "clickAddToCart")
    public void ClickCart(){ homePage.ClickCart();}

//    //@Test(Priority = 4)
 @Test(dependsOnMethods = "ClickCart")
 public void verifyAddedItems() { addedItems.verifyAddedItems();   }

  @Test(dependsOnMethods = "verifyAddedItems")
public  void CheckoutAddedItems(){addedItems.CheckoutAddedItems(); }

    @Test(dependsOnMethods = "CheckoutAddedItems")
    public void verifycheckoutDetails(){checkOut.verifycheckoutDetails();

    }
//@Test(dependsOnMethods =  "verifycheckoutDetails")
//        public void EnterName(){checkOut.EnterName(readFromFile.firstname);
//}

@Test(dependsOnMethods = "verifycheckoutDetails")
public void EnterName(){checkOut.EnterName(readFromFile.firstname);}

@Test(dependsOnMethods = "EnterName")
public void EnterLastName(){checkOut.EnterLastName(readFromFile.lastname);}

 @Test(dependsOnMethods = "EnterLastName")
public void EnterPostalCode(){checkOut.EnterPostalCode(readFromFile.postalcode);}


 @AfterTest
public void closeBrowser() {
 driver.quit();

    }
}
