package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutInfo {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement checkoutInfo_xpath;
    @FindBy(xpath= "xpath=//input[@id='first-name']")
    WebElement firstName_xpath;
    @FindBy(id = "last-name")
    WebElement lastName_id;
    @FindBy(id = "postal-code")
    WebElement postalCode_id;
    @FindBy(id = "continue")
    WebElement continueBtn_id;

    public CheckoutInfo(WebDriver driver) {

        this.driver = driver;
    }
    public void verifyCheckoutTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutInfo_xpath));
        checkoutInfo_xpath.isDisplayed();
    }
    public void enterFirstName(String firstname) {
        firstName_xpath.sendKeys(firstname);
    }

    public void enterLastname(String lastname) {
        lastName_id.sendKeys(lastname);
    }
    public void enterPostalCode(String postal_code) {
        postalCode_id.sendKeys(postal_code);
    }
    public void clickContinueBtn(){
        continueBtn_id.click();
    }



}