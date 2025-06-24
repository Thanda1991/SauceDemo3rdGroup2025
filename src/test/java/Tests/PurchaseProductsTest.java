package Tests;

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
    public void clickAddToCart(){

        homePage.clickAddToCart();
    }

    @Test(dependsOnMethods = "clickAddToCart")
    public void verifyRemoveButton(){

        homePage.verifyRemoveButton();
    }

    @Test(dependsOnMethods = "verifyRemoveButton")
    public void clickOnCart(){

        homePage.clickOnCart();
    }

    @Test(dependsOnMethods = "clickOnCart")
    public void verifyYourCartTitle(){

        cartPage.verifyYourCartTitle();
    }

    @Test(dependsOnMethods = "verifyYourCartTitle")
    public void clickOnCheckOutButton(){

        cartPage.clickOnCheckOutButton();
    }

    @Test(dependsOnMethods = "clickOnCheckOutButton")
    public void verifyYourInformationLabel(){

        checkOutInformationPage.verifyYourInformationLabel();
    }

    @Test(dependsOnMethods = "verifyYourInformationLabel")
    public void enterFirstNameYourInformation(){

        checkOutInformationPage.enterFirstNameYourInformation("Amanda");
    }

    @Test(dependsOnMethods = "enterFirstNameYourInformation")
    public void enterLastNameYourInformation(){

        checkOutInformationPage.enterLastNameYourInformation("Ramavhale");
    }

    @Test(dependsOnMethods = "enterLastNameYourInformation")
    public void enterPostCodeYourInformation(){

        checkOutInformationPage.enterPostCodeYourInformation("1632");
    }

    @Test(dependsOnMethods = "enterPostCodeYourInformation")
    public void clickContinueButton(){

        checkOutInformationPage.clickContinueButton();
    }

    @Test(dependsOnMethods = "clickContinueButton")
    public void verifyCheckOutLabel(){

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


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}
