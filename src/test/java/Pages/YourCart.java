package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YourCart {

    WebDriver driver;

    @FindBy(xpath = "xpath=//span[contains(.,'Your Cart')]")
    WebElement YourCartTitle_xpath;
    @FindBy(id = "id=checkout")
    WebElement ClickCheckout_id;

    public YourCart (WebDriver driver){
        this.driver = driver;
    }

    public void verifyYourCartTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(YourCartTitle_xpath));
        YourCartTitle_xpath.isDisplayed();

    }

    public void ClickCheckout(){
        ClickCheckout_id.click();

    }
}
