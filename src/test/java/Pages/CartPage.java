package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage {
    @FindBy(id ="title")
    WebElement cartTitle;
    @FindBy(xpath= "/html/body/div/div/div/div[2]/div/div[2]/button[2]")
    WebElement checkout;
    @FindBy(id = "title")
    WebElement getCartTitle;



    public void VerifyCartTitle(){
        String actualTitle = cartTitle.getText();

        Assert.assertTrue(actualTitle.contains("Your Cart"),
                "Expected title to contain 'Your Cart' but got: " + actualTitle);
    }


public void clickCheckout(){
    checkout.click();
}







}
