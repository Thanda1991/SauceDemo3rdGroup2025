package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YourInfomationPage {
    WebDriver driver;
    @FindBy(xpath = "//span[contains(.,'Checkout: Your Information')]")
    WebElement Information_xpath;

    @FindBy(id = "first-name")
    WebElement EnterName_id;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement EnterLastName_xpath;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement EnterPostalCode_xpath;

    @FindBy(id = "continue")
    WebElement ContinueBtn_id;
    public YourInfomationPage (WebDriver driver) {
        this.driver = driver;
    }

    public void verifyYourInfoTittle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(Information_xpath));
        Information_xpath.isDisplayed();
//        String actualTitle = productTitle_xpath.getText();
//        if (!actualTitle.equals(expectedTitle)) {
//            throw new AssertionError("Expected title: " + expectedTitle + ", but found: " + actualTitle);
//        }
    }

    public void enterName(String enterName) {
            EnterName_id.sendKeys(enterName);
        }
    public void enterLasname(String enterLastName) {
        EnterLastName_xpath.sendKeys(enterLastName);
    }
    public void enterPostalCode(String EnterPostalCode) {
        EnterPostalCode_xpath.sendKeys(EnterPostalCode);
    }
    public void ClickContinueButton() {
        ContinueBtn_id.click();
    }
    }


