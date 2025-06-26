package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckoutOverviewPage {
    @FindBy(className = "title")
    WebElement checkoutOverviewtitle;

    @FindBy(id= "finish")
    WebElement finish_id;


    public void VerifyCheckoutOverviewTitle() {
        String actualTitle = checkoutOverviewtitle.getText();
        Assert.assertTrue(actualTitle.contains("Checkout: Overview"),
                "Expected title to contain 'Checkout: Overview' but got: " + actualTitle);
    }

    public void ClickFinishButton(){
        finish_id.click();

    }



}
