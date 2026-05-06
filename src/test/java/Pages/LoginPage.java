package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "user-name")
    WebElement username_id;

    @FindBy(id = "password")
    WebElement password_id;

    @FindBy(id = "login-button")
    WebElement loginButton_id;

    @FindBy(xpath = "//span[contains(@class,'title') and contains(text(),'Product')]")
    WebElement productTitle_xpath;

    @FindBy(xpath="//h3[@data-test='error' and contains(.,'Epic sadface')]")
    WebElement errorMessage_xpath;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(webDriver -> username_id.isDisplayed() && username_id.isEnabled());
        username_id.clear();
        username_id.sendKeys(username);
    }

    public void enterPassword(String password) {
        password_id.clear();
        password_id.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton_id.click();
    }

    public boolean isLoginSuccessful() {
        try {

            return productTitle_xpath.isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLoginErrorDisplayed() {

        try {

            return errorMessage_xpath.isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }
}
