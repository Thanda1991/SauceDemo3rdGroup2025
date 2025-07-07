package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class VatCalc {

    WebDriver driver;

    @FindBy(xpath = "//div[@id='checkout_summary_container']/div/div[2]/div[6]")
    WebElement balance_Label_xpath;
    @FindBy(xpath = "xpath=//div[@id='checkout_summary_container']/div/div[2]/div[7]")
    WebElement vat_label_xpath;
    @FindBy(xpath = "//div[@id='checkout_summary_container']/div/div[2]/div[8]")
    WebElement grand_total_label_xpath;

    public void verifybalance() { //Show VAT and Grand Total on the page
        double subtotal = Double.parseDouble(balance_Label_xpath.getText());

        double vatPercent = Double.parseDouble(vat_label_xpath.getText());

        double grandtotal = Double.parseDouble(grand_total_label_xpath.getText());
        double vatAmount = subtotal * vatPercent / 100;
        double grandTotal = subtotal + vatAmount;

        // Calculate VAT (8%) and Grand Total
         vatPercent = 0.08;
        double vat = subtotal * vatPercent / 100;
        double grandTL = subtotal + vat;


        System.out.println("Selected Price: $" + subtotal);
        System.out.println("VAT (8%): $" + vat);
        System.out.println("Grand Total: $" + grandTotal);


    }
}


