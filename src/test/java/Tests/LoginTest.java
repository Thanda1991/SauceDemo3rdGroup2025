package Tests;
import Utils.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Base{

    @Test(dataProvider = "loginData", dataProviderClass = TestDataProvider.class)
    public void loginTest(String email, String password, String expectedResult) throws InterruptedException {

        loginPage.enterUsername(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        Thread.sleep(1000);

        if (expectedResult.equals("success")) {
            Assert.assertTrue(loginPage.isLoginSuccessful());
            homePage.clickOnBurgerButton();
            homePage.clickOnLogOut();
        } else {
            Assert.assertTrue(loginPage.isLoginErrorDisplayed());
        }
    }
}
