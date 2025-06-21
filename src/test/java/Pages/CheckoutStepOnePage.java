package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutStepOnePage {

    WebDriver driver;

    @FindBy(xpath="//div[@id='header_container']/div[2]/span")
    WebElement checkoutTitle_xpath;

    @FindBy(id="first-name")
    WebElement firstName_id;

    @FindBy(id="last-name")
    WebElement lastName_id;

    @FindBy(id="postal-code")
    WebElement postalCode_id;

    @FindBy(id="continue")
    WebElement continueButton_id;

    public CheckoutStepOnePage (WebDriver driver){
        this.driver=driver;
    }

    public void verifyCheckoutTitle(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutTitle_xpath));
        checkoutTitle_xpath.isDisplayed();
    }

    public void enterFirstName(String fname){
        firstName_id.sendKeys(fname);
    }

    public void enterLastName(String lname){
        lastName_id.sendKeys(lname);
    }

    public void enterPostalCode(String pcode){
        postalCode_id.sendKeys(pcode);
    }

    public void clickContinueButton(){
        continueButton_id.click();
    }
}
