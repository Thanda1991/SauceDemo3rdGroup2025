package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfoPage {
    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstname_id;

    @FindBy(id = "last-name")
    WebElement lastname_id;

    @FindBy(id = "postal-code")
    WebElement postalcode_id;

    @FindBy(id = "continue")
    WebElement continue_id;

    public InfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        firstname_id.sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        lastname_id.sendKeys(lastName);
    }
    public void enterPostalCode(String postalCode) {
        postalcode_id.sendKeys(postalCode);
    }
    public void clickContinue() {
        continue_id.click();
    }
}
