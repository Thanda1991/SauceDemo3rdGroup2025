package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyCartView {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement cartTitle_xpath;
    @FindBy(id = "checkout")
    WebElement checkoutBtn_id;

    public void verifyCartTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(cartTitle_xpath));
        cartTitle_xpath.isDisplayed();
    }
    public void clickCheckoutButton() {

        checkoutBtn_id.click();
    }



}
