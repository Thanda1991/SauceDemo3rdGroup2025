package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CompletePage {
    WebDriver driver;

    @FindBy(xpath = "//h2[contains(.,'Thank you for your order!')]")
    WebElement checkOutComplete_xpath;
    @FindBy(id = "back-to-products")
    WebElement backToProducts_id;

    public CompletePage (WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCompleteCheckOut(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkOutComplete_xpath));
        checkOutComplete_xpath.isDisplayed();
    }

    public void backToProductButton(){
        backToProducts_id.click();
    }
}
