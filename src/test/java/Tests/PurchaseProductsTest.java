package Tests;

import Utils.ReadFromFile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseProductsTest extends Base {

    public void enterUsername() {

        loginPage.enterUsername(ReadFromFile.username);
    }

    @Test(dependsOnMethods = "enterUsername")
    //@Test(priority = 1)
    public void enterPassword() {

        loginPage.enterPassword(ReadFromFile.password);
    }

    //@Test(priority = 2)
    @Test(dependsOnMethods = "enterPassword")
    public void clickLoginButton() {

        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void verifyProductTitle() {

        homePage.verifyProductTitle();
    }

    @Test(dependsOnMethods = "verifyProductTitle")
    public void clickAddToCart() {

        homePage.clickAddToCart();
    }

//   @Test(dependsOnMethods = "clickAddToCart")
//  public void verifyRemoveButton(){
//
//       homePage.verifyRemoveButton();
//   }

    @Test(dependsOnMethods = "clickAddToCart")
    public void ClickCart() {

        homePage.ClickCart();
    }

    @Test(dependsOnMethods = "ClickCart")
    public void verifyYourCartTitle() {

        cartPage.verifyYourCartTitle();
    }

    @Test(dependsOnMethods = "verifyYourCartTitle")
    public void clickOnCheckOutButton() {

        cartPage.clickOnCheckOutButton();
    }

    @Test(dependsOnMethods = "clickOnCheckOutButton")
    public void verifyYourInformationLabel() {

        checkOutpage.verifyYourInformationLabel();
    }

    @Test(dependsOnMethods = "verifyYourInformationLabel")
    public void enterFirstNameYourInformation() {

        checkOutpage.enterFirstNameYourInformation(readFromFile.firstName);
    }

    @Test(dependsOnMethods = "enterFirstNameYourInformation")
    public void enterLastNameYourInformation() {

        checkOutpage.enterLastNameYourInformation(readFromFile.lastName);
    }

    @Test(dependsOnMethods = "enterLastNameYourInformation")
    public void enterPostCodeYourInformation() {

        checkOutpage.enterPostCodeYourInformation(readFromFile.postalCode);
    }

    @Test(dependsOnMethods = "enterPostCodeYourInformation")
    public void clickContinueButton() {

        checkOutpage.clickContinueButton();
    }

    @Test(dependsOnMethods = "clickContinueButton")
    public void verifyCheckOutLabel() {

        checkOutOverViewPagePage.verifyCheckOutLabel();
    }

    @Test(dependsOnMethods = "verifyCheckOutLabel")
    public void clickFinishButton() {
        checkOutOverViewPagePage.clickFinishButton();
    }

    @Test(dependsOnMethods = "clickFinishButton")
    public void verifyThankYouLabel() {
        checkOutThankYouPage.verifyThankYouLabel();
    }

    @Test(dependsOnMethods = "verifyThankYouLabel")
    public void clickBackHomeButton() {
        checkOutThankYouPage.clickBackHomeButton();
    }


    @Test(dependsOnMethods = "verifyThankYouLabel")
    public void clickOnBurgerButton() {

        homePage.clickOnBurgerButton();
    }

    @Test(dependsOnMethods = "clickOnBurgerButton")
    public void clickOnLogOut() {
        homePage.clickOnLogOut();

    }
//
//    @AfterTest
//    public void closeBrowser() {
//        driver.quit();
//    }


}
