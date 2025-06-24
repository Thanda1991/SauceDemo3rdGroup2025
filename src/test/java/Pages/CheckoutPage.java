package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstName_id;

    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy(id = "continue")
    WebElement continueButton_id;

    @FindBy(xpath = "//span[@class='title' and text()='Checkout: Overview']")
    WebElement checkoutOverview_xpath;

    @FindBy(id = "finish")
    WebElement finishButton_id;


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstname(String username) {
        firstName_id.sendKeys(username);
    }

    public void enterLastName(String password) {
        lastName_id.sendKeys(password);
    }

    public void enterPostalCode(String password) {
        postalCode_id.sendKeys(password);
    }

    public void clickContinueButton() {
        this.continueButton_id.click();
    }

    public void verifyCheckoutOverviewTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutOverview_xpath));
        checkoutOverview_xpath.isDisplayed();
    }
    public void clickFinishButton() {
        this.finishButton_id.click();
    }
}
