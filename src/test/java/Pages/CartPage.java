package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    WebDriver driver;

    @FindBy(id ="remove-sauce-labs-backpack")
    WebElement removeProductOnCartButton_id;

    @FindBy(id ="checkout")
    WebElement checkoutButton_id;

    public CartPage(WebDriver driver){
        this.driver=driver;
    }

    public void verifyRemoveButton(){
        removeProductOnCartButton_id.isDisplayed();
    }

    public void clickCheckoutButton(){
        checkoutButton_id.click();
    }
}
