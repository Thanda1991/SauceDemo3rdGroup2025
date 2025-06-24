package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Overview')]")
    WebElement checkOut_xpath;
    @FindBy(id = "finish")
    WebElement finish_id;

    public CheckOutPage (WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCheckoutTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkOut_xpath));
        checkOut_xpath.isDisplayed();
    }

    public void finishButton(){
        finish_id.click();
    }
}
