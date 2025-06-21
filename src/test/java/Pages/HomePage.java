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

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeProductButton_id;

    @FindBy(id = "shopping_cart_container")
    WebElement clickCart_id;

    @FindBy(id="react-burger-menu-btn")
    WebElement burgerMenuButton_id;

    @FindBy(id="logout_sidebar_link")
    WebElement logoutLink_id;

    public HomePage (WebDriver driver) {

        this.driver = driver;
    }

    public void verifyProductTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        productTitle_xpath.isDisplayed();
//        String actualTitle = productTitle_xpath.getText();
//        if (!actualTitle.equals(expectedTitle)) {
//            throw new AssertionError("Expected title: " + expectedTitle + ", but found: " + actualTitle);
//        }
    }
    public void clickAddToCart() {

        addToCart_id.click();
    }

    public void verifyProductSelection(){
        removeProductButton_id.isDisplayed();
    }

    public void navigateToCart(){
        clickCart_id.click();
    }

    public void clickBurgerMenuButton(){
        burgerMenuButton_id.click();
    }

    public void clickLogoutLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoutLink = wait.until(ExpectedConditions.elementToBeClickable(logoutLink_id));
        logoutLink_id.click();
    }


}
