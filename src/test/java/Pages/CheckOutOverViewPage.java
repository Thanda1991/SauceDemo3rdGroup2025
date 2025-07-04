package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutOverViewPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Overview')]")
    WebElement checkoutLabel_xpath;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton_xpath;

    public void verifyCheckOutLabel(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutLabel_xpath));
        checkoutLabel_xpath.isDisplayed();
    }

    public void clickFinishButton(){
        finishButton_xpath.click();
    }


}
