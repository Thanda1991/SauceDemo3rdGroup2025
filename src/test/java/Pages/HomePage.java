package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title']")
    WebElement productTitle_xpath;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart_id;
    @FindBy(xpath ="//div[@id='shopping_cart_container']/a/span")
    WebElement ViewCartItems_xpath;
    //

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProductTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        productTitle_xpath.isDisplayed();
//        String actualTitle = productTitle_xpath.getText();
//        if (!actualTitle.equals(expectedTitle)) {
//            throw new AssertionError("Expected title: " + expectedTitle + ", but found: " + actualTitle);
//        }
    }
    public void clickAddToCart() {
        addToCart_id.click();
    }
    // Button or clicking the actual Cart Icon
    public void ClickCart(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(ViewCartItems_xpath));
        ViewCartItems_xpath.click();
    }
}
