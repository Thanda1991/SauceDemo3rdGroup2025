package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utils.HighlightElements.highlight;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "user-name")
    WebElement username_id;

    @FindBy(id = "password")
    WebElement password_id;

    @FindBy(id = "login-button")
    WebElement loginButton_id;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(webDriver -> username_id.isDisplayed() && username_id.isEnabled());
        username_id.sendKeys(username);
    }

    public void enterPassword(String password) {
        password_id.sendKeys(password);
    }

    public void clickLoginButton() {
        highlight(loginButton_id);
        loginButton_id.click();
    }


}
