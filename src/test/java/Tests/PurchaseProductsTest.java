package Tests;

import Pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseProductsTest extends Base{

    public void enterUsername()
    {
        loginPage.enterUsername("standard_user");
    }
    public void enterUPassword()
    {
        loginPage.enterPassword("secret_sauce");
    }
    public void clickLoginButton()
    {
        loginPage.clickLoginButton();
    }

    @AfterTest
    public void closeBrowser()

    {
      driver.quit();
    }



}
