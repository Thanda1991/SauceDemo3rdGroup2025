package Tests;

import Utils.ReadFromFile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseProductsTest extends Base{

    public void enterUsername(){

        loginPage.enterUsername(ReadFromFile.username);
    }

    @Test(dependsOnMethods = "enterUsername")
    //@Test(priority = 1)
    public void enterPassword(){

        loginPage.enterPassword(ReadFromFile.password);
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

    /*@Test(dependsOnMethods = "clickAddToCart")
    public void verifyRemoveButton(){

       // homePage.verifyRemoveButton();
    }*/

    @Test(dependsOnMethods = "clickAddToCart")
    public void clickOnCart(){

       homePage.ClickCart();
    }

    @Test(dependsOnMethods = "clickOnCart")
    public void verifyYourCartTitle(){

        cartPage.verifyYourCartTitle();
    }

    @Test(dependsOnMethods = "verifyYourCartTitle")
    public void ClickOnCheckOutButton()
    {
        cartPage.clickOnCheckOutButton();
    }

    @Test(dependsOnMethods = "ClickOnCheckOutButton")
    public void verifyYourInformationLabel()
    {
        checkOutInformationPage.verifyYourInformationLabel();
    }

    @Test(dependsOnMethods = "verifyYourInformationLabel")
    public void enterFirstNameYourInformation(){

        checkOutInformationPage.enterFirstNameYourInformation(readFromFile.firstName);
    }

    @Test(dependsOnMethods = "enterFirstNameYourInformation")
    public void enterLastNameYourInformation(){

        checkOutInformationPage.enterLastNameYourInformation(readFromFile.lastName);
    }

    @Test(dependsOnMethods = "enterLastNameYourInformation")
    public void enterPostCodeYourInformation(){

        checkOutInformationPage.enterPostCodeYourInformation(readFromFile.postalCode);
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

       // homePage.clickOnBurgerButton();
    }

    @Test(dependsOnMethods = "clickOnBurgerButton")
    public void clickOnLogOut() {
        //homePage.clickOnLogOut();
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}
