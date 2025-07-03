package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CompletePage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    WebElement completeTitle_xpath;

    @FindBy(id = "back-to-products")
    WebElement backToProducts_id;

    public  CompletePage (WebDriver driver) {
        this.driver = driver;
    }

    public  void VerifyCompleteTitle(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(completeTitle_xpath));
        completeTitle_xpath.isDisplayed();
    }


    public void clickBackToProducts() {
        backToProducts_id.click();
    }
}
