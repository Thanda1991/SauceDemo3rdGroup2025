package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutOverViewPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Overview')]")
    WebElement checkoutLabel_xpath;

    @FindBy(className = "summary_subtotal_label")
    WebElement itemTotalLabel_className;

    @FindBy(className = "summary_tax_label")
    WebElement taxLabel_className;

    @FindBy(className = "summary_total_label")
    WebElement totalLabel_className;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton_xpath;

    public void verifyCheckOutLabel(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutLabel_xpath));
        checkoutLabel_xpath.isDisplayed();
    }

    public void clickFinishButton(){
        finishButton_xpath.click();
    }

    public double getItemTotal() {
        String text = itemTotalLabel_className.getText();
        return Double.parseDouble(text.substring(text.indexOf("$") + 1));
        //return Double.parseDouble(text.replaceAll("[^\\d.]", ""));

    }

    public double getTax() {
        String text = taxLabel_className.getText();
        return Double.parseDouble(text.substring(text.indexOf("$") + 1));
        //return Double.parseDouble(text.replaceAll("[^\\d.]", ""));

    }

    public double getTotal() {
        String text = totalLabel_className.getText();
        return Double.parseDouble(text.substring(text.indexOf("$") + 1));
        //return Double.parseDouble(text.replaceAll("[^\\d.]", ""));
    }


}
