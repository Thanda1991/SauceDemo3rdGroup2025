package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Your Cart')]")
    WebElement yourCart_xpath;
    @FindBy(id = "checkout")
    WebElement checkout_id;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyContentsContainer() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(yourCart_xpath));
        yourCart_xpath.isDisplayed();
    }

    public void checkout_id(){checkout_id.click();}

}
