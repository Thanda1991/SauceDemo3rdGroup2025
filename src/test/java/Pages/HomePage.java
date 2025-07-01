package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utils.HighlightElements.highlight;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title']")
    WebElement productTitle_xpath;

    @FindBy(css="#add-to-cart-sauce-labs-bike-light")
    WebElement AddToCart_id;

    @FindBy(id = "shopping_cart_badge")
    WebElement cartBadge ;

    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement removeButton ;
    @FindBy(id = "shopping_cart_container")
    WebElement cartContainer ;
    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProductTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        productTitle_xpath.isDisplayed();
        highlight(productTitle_xpath);
//        String actualTitle = productTitle_xpath.getText();
//        if (!actualTitle.equals(expectedTitle)) {
//            throw new AssertionError("Expected title: " + expectedTitle + ", but found: " + actualTitle);
//        }
    }

    public void ClickAddToCart()  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(AddToCart_id));
        AddToCart_id.click();

    }

    public void VerifyRemoveButton() {
        removeButton.isDisplayed();
        highlight(removeButton);

    }

    public void ClickShoppingCart() {
        cartContainer.click();

    }


}
