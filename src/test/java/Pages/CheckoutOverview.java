package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutOverview {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement checkoutTitle_xpath;
    @FindBy(id = "finish")
    WebElement finishCheckout_id;

    public void verifyCheckoutTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutTitle_xpath));
        checkoutTitle_xpath.isDisplayed();
    }
    public void clickFinishCheckoutButton() {

        finishCheckout_id.click();
    }

}
