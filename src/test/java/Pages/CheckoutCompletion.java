package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckoutCompletion {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    WebElement completionHeader_xpath;
    @FindBy(id = "react-burger-menu-btn")
    WebElement locateBurgerMenu_id;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink_id;

    public void verifyCompletionHeader() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(completionHeader_xpath));
        completionHeader_xpath.isDisplayed();
    }
    public void clickBurgerMenu() {
        locateBurgerMenu_id.click();
    }
    public void clickLogoutLink() {
        logoutLink_id.click();
    }

}
