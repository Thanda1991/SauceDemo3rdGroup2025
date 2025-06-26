package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;

    @FindBy(id = "checkout")
    WebElement checkout_id;

    @FindBy(id = "first-name")
    WebElement firstName_id;

    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterFirstName(String firstName){
        firstName_id.sendKeys(firstName);
    }
    public void enterSurname(String lastName){
        lastName_id.sendKeys(lastName);
    }
    public void enterPostalCode(String pCode){
        postalCode_id.sendKeys(pCode);
    }
    public void clickCheckout() {
        checkout_id.click();
    }

}
