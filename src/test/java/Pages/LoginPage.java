package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

//Initialize Webdriver
    WebDriver driver;

    //Locators for your login page elements
    @FindBy(id="user-name")
    WebElement username_id;
    @FindBy(id="password")
    WebElement password_id;
    @FindBy(id="login-button")
    WebElement loginButton_id;

    //Create Methods
    public void enterUsername(String username)
    {
        username_id.sendKeys(username);
    }
    public void enterPassword(String password)
    {
        password_id.sendKeys(password);
    }
    public void clickLoginButton()
    {
        loginButton_id.click();
    }

    //Create constructor for the login page
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }


}
