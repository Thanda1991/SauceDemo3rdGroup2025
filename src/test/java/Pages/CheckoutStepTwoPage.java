package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutStepTwoPage {
    WebDriver driver;

    @FindBy(xpath="//span[contains(.,'Checkout: Overview')]")
    WebElement verifyCheckoutTitlePageTwo_xpath;

    @FindBy(id="finish")
    WebElement finishButton_id;

    public CheckoutStepTwoPage (WebDriver driver){
        this.driver=driver;

    }

    public void VerifyCheckoutTitlePageTwo(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(verifyCheckoutTitlePageTwo_xpath));
        verifyCheckoutTitlePageTwo_xpath.isDisplayed();
    }

    public void clickFinishButton(){
        finishButton_id.click();
    }
}
