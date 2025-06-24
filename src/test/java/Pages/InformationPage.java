package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InformationPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Your Information')]")
    WebElement InfoTitle_xpath;
    @FindBy(id = "first-name")
    WebElement FirstName_id;

    public InformationPage (WebDriver driver) {
        this.driver = driver;
    }

    public void verifyInformationTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(InfoTitle_xpath));
        InfoTitle_xpath.isDisplayed();
    }

    public void firstName() {
        driver.findElement(By.id("first-name")).sendKeys("cece");
    }
}


