package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static Utils.HighlightElements.highlight;

public class CheckoutPage {
    @FindBy(css = "#header_container > div.header_secondary_container > span")
    WebElement checkoutInfoTitle;

    @FindBy(id = "first-name")
    WebElement firstname;
    @FindBy(id = "last-name")
    WebElement lastname;

    @FindBy(id ="postal-code")
    WebElement postalcode;

    @FindBy(id ="continue")
    WebElement continue_id;


    public void VerifyCheckoutTitle() {
        String actualTitle = checkoutInfoTitle.getText();
        Assert.assertTrue(actualTitle.contains("Checkout: Your Information"),
                "Expected title to contain 'Checkout: Your Information' but got: " + actualTitle);
        highlight(checkoutInfoTitle);
    }

    public void enterFirstname(String Fname) {
        firstname.sendKeys(Fname);
    }
    public void enterLastname(String Lname) {
      lastname.sendKeys(Lname);
    }

    public void enterPostal(String Pcode) {
        postalcode.sendKeys(Pcode);
    }


    public void ClickContinue(){

        continue_id.click();
    }


}
