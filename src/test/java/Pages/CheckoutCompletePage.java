package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage {
    WebDriver driver;

    @FindBy(xpath = "//div[@id='checkout_complete_container']/h2")
    WebElement orderConfirmationTitle_xpath;

    @FindBy(id="back-to-products")
    WebElement backButton_id;

    public CheckoutCompletePage(WebDriver driver){
        this.driver=driver;
    }

    public void verifyOrderConfirmationTitle(){
        orderConfirmationTitle_xpath.isDisplayed();
    }

    public void clickBackButton(){
        backButton_id.click();
    }
}
