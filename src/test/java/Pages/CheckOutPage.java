package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage {

    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstName_id;

    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy(id = "continue")
    WebElement continue_id;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstname(String firstname) {
        firstName_id.sendKeys(firstname);
    }

    public void enterLastname(String lastname) {
        lastName_id.sendKeys(lastname);
    }

    public void enterPostalcode(String postalcode) {
        postalCode_id.sendKeys(postalcode);
    }

    public void submitButton() {
        continue_id.click();
    }
}