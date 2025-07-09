package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutOverview {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Overview')]")
    WebElement checkoutLabel_xpath;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton_xpath;

    @FindBy(xpath = "//div[@id='checkout_summary_container']/div/div[2]/div[6]")
    WebElement balance_Label_xpath;

    public void verifyCheckOutLabel() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutLabel_xpath));
        checkoutLabel_xpath.isDisplayed();
    }

    public void verifybalance() { //Show VAT and Grand Total on the page
        double subtotal = Double.parseDouble(balance_Label_xpath.getText());

        // Calculate VAT (8%) and Grand Total
        double vatPercent = 0.08;
        double vat = subtotal * vatPercent / 100;
        double grandTotal = subtotal + vat;

        System.out.println("Selected Price: $" + subtotal);
        System.out.println("VAT (8%): $" + vat);
        System.out.println("Grand Total: $" + grandTotal);


    }
    public void clickFinishButton() {
        finishButton_xpath.click();
    }


}
