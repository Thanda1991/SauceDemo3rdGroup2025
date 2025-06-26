package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YourInfoPage {

    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstName_id;

    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy (xpath = "xpath=//span[contains(.,'Checkout: Your Information')]")
    WebElement YourInfoTitle_xpath;

    @FindBy (id = "continue")
    WebElement continueButton_id;

    public void YourInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyYourInfoTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(1000)).until(ExpectedConditions.visibilityOf(YourInfoTitle_xpath));
        YourInfoTitle_xpath.isDisplayed();
    }

    public void enterFirstName(String firstName) {
        firstName_id.sendKeys(firstName);

    }

    public void enterLastName(String lastName) {
        lastName_id.sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        postalCode_id.sendKeys(postalCode);
    }

    public void clickContinue() {
        continueButton_id.click();
    }


}
