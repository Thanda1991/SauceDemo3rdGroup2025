package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Your Information')]")
    WebElement yourInformationLabel;

    @FindBy(id = "first-name")
    WebElement firstNameYourInformation;

    @FindBy(id = "last-name")
    WebElement lastNameYourInformation;

    @FindBy(id = "postal-code")
    WebElement postCodeYourInformation;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(xpath = "//div[@id='checkout_summary_container']/div/div[2]/div[6]")
    WebElement balance_Label_xpath;

    @FindBy(xpath = "xpath=//div[@id='checkout_summary_container']/div/div[2]/div[7]")
    WebElement vat_label_xpath;

    @FindBy(xpath = "//div[@id='checkout_summary_container']/div/div[2]/div[8]")
    WebElement grand_total_label_xpath;


    //checking if i am on the shipping details page
    public void verifyYourInformationLabel() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(yourInformationLabel));
        yourInformationLabel.isDisplayed();
    }

    //methods that will add my shipping details
    public void enterFirstNameYourInformation(String FirstName) {

        firstNameYourInformation.sendKeys(FirstName);
    }

    public void enterLastNameYourInformation(String LastName) {

        lastNameYourInformation.sendKeys(LastName);
    }

    public void enterPostCodeYourInformation(String PostCode) {

        postCodeYourInformation.sendKeys(PostCode);
    }

    public void clickContinueButton() {

        continueButton.click();
    }

    public double getTheAmount(WebElement element) {
        String itemCostText = element.getText();
        String[] splitTex = itemCostText.split("\\$");
        return Double.parseDouble(splitTex[1]);
    }

    public void VatCalc() {
        double sum = getTheAmount(balance_Label_xpath) + getTheAmount(vat_label_xpath);
        double totalAmount = Math.floor(sum * 100) / 100;
        double actualTotal = getTheAmount(grand_total_label_xpath);
        Assert.assertEquals(totalAmount, actualTotal);
        System.out.println("Expected amount:" + totalAmount + "=" + "Actual amount");
    }


}
