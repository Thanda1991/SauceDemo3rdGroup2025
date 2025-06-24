package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ThankYouPage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title' and text()='Checkout: Complete!']")
    WebElement checkoutCompleteLabel_xpath;

    @FindBy(className = "complete-header")
    WebElement thankYouMessage_className;

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerMenu_id;

    @FindBy(xpath = "//a[@id='logout_sidebar_link' and text()='Logout']")
    WebElement logoutButton_xpath;





    public void verifyCheckoutCompleteTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutCompleteLabel_xpath));
        checkoutCompleteLabel_xpath.isDisplayed();
    }

    public void verifyCheckoutThankYouMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(thankYouMessage_className));
        thankYouMessage_className.isDisplayed();
    }
    public void clickBurgerMenu() {
        this.burgerMenu_id.click();
    }

    public void clickLogoutButton() {
        this.logoutButton_xpath.click();
    }




}
