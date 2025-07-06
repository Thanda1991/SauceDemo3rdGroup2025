package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;

    @FindBy(xpath="//span[contains(.,'Checkout: Your Information')]")
    WebElement yourInformationLabel;

    @FindBy(id="first-name")
    WebElement firstNameYourInformation;

    @FindBy(id="last-name")
    WebElement lastNameYourInformation;

    @FindBy(id="postal-code")
    WebElement postCodeYourInformation;

    @FindBy(id="continue")
    WebElement continueButton;
    //checking if i am on the shipping details page
    public void verifyYourInformationLabel(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(yourInformationLabel));
        yourInformationLabel.isDisplayed();
    }
    //methods that will add my shipping details
    public void enterFirstNameYourInformation(String FirstName){

        firstNameYourInformation.sendKeys(FirstName);
    }

    public void enterLastNameYourInformation(String LastName){

        lastNameYourInformation.sendKeys(LastName);
    }

    public void enterPostCodeYourInformation(String PostCode){

        postCodeYourInformation.sendKeys(PostCode);
    }
    public void clickContinueButton(){

        continueButton.click();
    }

}
