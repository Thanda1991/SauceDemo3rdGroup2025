package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class CompletePage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement completeTitle_xpath;

    @FindBy(id = "back-to-products")
    WebElement backToProducts_id;

    public  CompletePage (WebDriver driver) {
        this.driver = driver;
    }

    public  void verifyCompleteTitle() {
        completeTitle_xpath.isDisplayed();
    }
    @Test(dependsOnMethods = "verifyCompleteTitle")
    public void clickBackToProducts() {
        backToProducts_id.click();
    }
}
