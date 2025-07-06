package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ThankyouPage {

    WebDriver driver;

    @FindBy(xpath = "//h2[contains(.,'Thank you for your order!')]")
    WebElement thankYouLabel_xpath;

    @FindBy(id = "back-to-products")
    WebElement BackHomeButton_id;

    public void verifyThankYouLabel(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(thankYouLabel_xpath));
        thankYouLabel_xpath.isDisplayed();
    }
    public void clickBackHomeButton(){
        BackHomeButton_id.click();
    }




}
