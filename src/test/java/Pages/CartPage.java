package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Your Cart')]")
    WebElement yourCartTitle_Xpath;

    @FindBy(id = "checkout")
    WebElement clickCheckOutButton_id;

    public void verifyYourCartTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(yourCartTitle_Xpath));
        yourCartTitle_Xpath.isDisplayed();
    }

    public void clickOnCheckOutButton(){
        clickCheckOutButton_id.click();
    }







}
