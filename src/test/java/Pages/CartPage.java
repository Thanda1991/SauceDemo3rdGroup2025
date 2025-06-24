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
    WebElement CartTitle_xpath;
    @FindBy(id = "checkout")
    WebElement CheckOut_id;

    public CartPage (WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCartTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(CartTitle_xpath));
        CartTitle_xpath.isDisplayed();
    }

    public void clickCheckOut() {
        CheckOut_id.click();
    }
}
