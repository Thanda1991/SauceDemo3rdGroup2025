package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckOutOverViewPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Overview')]")
    WebElement checkoutLabel_xpath;

    @FindBy(xpath = "//div[@class='summary_subtotal_label'][contains(.,'Item total: $29.99')]")
    WebElement itemTotal_xpath;

    @FindBy(xpath = "//div[@class='summary_tax_label'][contains(.,'Tax: $2.40')]")
    WebElement tax_xpath;

    @FindBy(xpath = "//div[@class='summary_total_label'][contains(.,'Total: $32.39')]")
    WebElement total_xpath;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton_xpath;

    public void verifyCheckOutLabel(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutLabel_xpath));
        checkoutLabel_xpath.isDisplayed();
    }


    public void calcTotal()
    {
        String itemText = itemTotal_xpath.getText().trim();// e.g., "Item total: $29.99"
        String taxText = tax_xpath.getText().trim();// e.g., "Tax: $2.40"
        String totalText = total_xpath.getText().trim(); // e.g., "Total: $32.39"


        String itemAmount = itemText.replaceAll("[^0-9.]", "");// "29.99"
        String taxAmount = taxText.replaceAll("[^0-9.]", ""); // "2.40"
        String totalAmount = totalText.replaceAll("[^0-9.]", "");// "32.39"

        double item = Double.parseDouble(itemAmount);
        double tax = Double.parseDouble(taxAmount);
        double total = Double.parseDouble(totalAmount);

        if (Math.abs((item + tax) - total) < 0.01) {
            //Assert.assertTrue("True");
            System.out.println("Calculation is correct.");
            System.out.println("Amount: " + itemAmount + " + " + taxAmount + " equals Total: " + totalAmount);
        } else {
            Assert.fail("Mismatch in total calculation.");
            System.out.println("Mismatch in total calculation.");
        }


    }

    public void clickFinishButton(){
        finishButton_xpath.click();
    }


}
