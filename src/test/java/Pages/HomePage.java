package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title']")
    WebElement productTitle_xpath;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart_id;

    @FindBy(id="remove-sauce-labs-backpack")
    WebElement removeFromCart_id;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    WebElement clickOnCart_xpath;

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerButton_id;

    @FindBy(id = "logout_sidebar_link")
    WebElement logOut_id;


    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProductTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        productTitle_xpath.isDisplayed();

    }
    public void clickAddToCart() {
        addToCart_id.click();
    }
    public void verifyRemoveButton() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        removeFromCart_id.isDisplayed();
    }

    public void clickOnCart() {
        clickOnCart_xpath.click();
    }
    public void clickOnBurgerButton()  {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        burgerButton_id.click();
    }
    public void clickOnLogOut()  {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        logOut_id.click();
    }


}
