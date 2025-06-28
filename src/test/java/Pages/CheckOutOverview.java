package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutOverview {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement checkoutoverview_xpath;

    @FindBy(id = ("finish"))
    WebElement buttonfinish_xpath;

    public CheckOutOverview(WebDriver driver) {
        this.driver = driver;
    }

    public void CheckedOut() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutoverview_xpath));
        checkoutoverview_xpath.isDisplayed();
    }

    public void btnfinish() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(buttonfinish_xpath));
        buttonfinish_xpath.isDisplayed();

    }

}
