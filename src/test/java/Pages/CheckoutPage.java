package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
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
    WebElement FirstName_id;

    @FindBy(id = "last-name")
    WebElement LastName_id;

    @FindBy(id = "postal-code")
    WebElement Postalcode_id;
    @FindBy(id = "continue")
    WebElement Continue_id;


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckout() {
        checkout_id.click();
    }

    public void enterFirstName(String firstName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(FirstName_id));
        FirstName_id.sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(LastName_id));
        LastName_id.sendKeys(lastName);
    }
    public void enterPostalCode(String postalCode) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(Postalcode_id));
        Postalcode_id.sendKeys(postalCode);
    }
    public void clickContinue() {
        Continue_id.click();
    }

}
