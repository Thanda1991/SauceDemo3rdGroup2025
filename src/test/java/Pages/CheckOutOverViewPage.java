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

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")
    WebElement itemTotal_xpath;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")
    WebElement tax_xpath;

    @FindBy(xpath = "//div[@id='checkout_summary_container']/div/div[2]/div[8]")
    WebElement Tatal_xpath;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton_xpath;

    @FindBy(id = "cancel")
    WebElement cancelButton_id;

    public void verifyCheckOutLabel(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutLabel_xpath));
        checkoutLabel_xpath.isDisplayed();
    }
    public void PaymentInformation() {
        String itemTotal = itemTotal_xpath.getText();
        String numericItemTotal = itemTotal.replaceAll("[^\\d.]", "");

        //
        String tax = tax_xpath.getText();
        String numericTax = tax.replaceAll("[^\\d.]", "");


        String totPrice = Tatal_xpath.getText();
        String totalprice = totPrice.replaceAll("[^\\d.]", "");




        if (Double.parseDouble(numericItemTotal) + Double.parseDouble(numericTax) == Double.parseDouble(totalprice)) {
            finishButton_xpath.click();
        } else {
            cancelButton_id.click();
        }
        System.out.println(numericItemTotal + " " + numericTax + " " + totalprice);
    }
//    //public void clickFinishButton() {
//        finishButton_xpath.click();
//    }
 //   public void clickCancelbtn() {
      //  cancelButton_id.click();
    //}

}