package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//span[@class='title' and text()='Your Cart']")
    WebElement yourCartLabel_xpath;

    @FindBy(xpath = "//button[@name='checkout' and text()='Checkout']")
    WebElement checkoutButton_xpath;

    public CartPage (WebDriver driver) {
        this.driver = driver;
    }

    public void verifyYourCartTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(yourCartLabel_xpath));
        yourCartLabel_xpath.isDisplayed();
    }
    public void clickOnCheckoutButton() {
        checkoutButton_xpath.click();
    }
}
