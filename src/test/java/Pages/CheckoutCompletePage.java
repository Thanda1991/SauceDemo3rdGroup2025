package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckoutCompletePage {

    @FindBy(className = "complete-header")
    WebElement checkoutComplete;

    @FindBy(id = "back-to-products")
    WebElement backHome_id;

    public void VerifyCheckoutComplete() {
        String actualTitle = checkoutComplete.getText();
        Assert.assertTrue(actualTitle.contains("Thank you for your order!"),
                "Expected title to contain 'Thank you for your order!' but got: " + actualTitle);
    }


   public void clickBackHome(){
        backHome_id.click();
   }


}
