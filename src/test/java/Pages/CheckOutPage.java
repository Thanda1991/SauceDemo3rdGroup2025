package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CheckOutPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Overview')]")
    WebElement checkOut_xpath;
    @FindBy(id = "finish")
    WebElement finish_id;

    @FindBy(xpath = "//div[@id='checkout_summary_container']/div/div[2]/div[6]")
    WebElement itemTotal_xpath;
    @FindBy(xpath = "//div[@id='checkout_summary_container']/div/div[2]/div[7]")
    WebElement tax_xpath;
    @FindBy(xpath = "//div[@id='checkout_summary_container']/div/div[2]/div[8]")
    WebElement total_xpath;

    public CheckOutPage (WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCheckoutTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkOut_xpath));
        checkOut_xpath.isDisplayed();
    }

    public double getTheAmount(WebElement element){

        String itemCostText = element.getText();  // Assuming the element contains the price as text
        String[] splitText = itemCostText.split("\\$"); // Split the string by the dollar sign
        return Double.parseDouble(splitText[1]); // Convert the second part to double
    }
    public void ValidateTotal() {
        double sum = getTheAmount(itemTotal_xpath) + getTheAmount(tax_xpath);
        double totalAmount = Math.floor(sum * 100) / 100; // Round to two decimal places
        double actualTotal = getTheAmount(total_xpath);
        Assert.assertEquals(totalAmount, actualTotal);
        System.out.println("Expected amount : " + totalAmount +" = Actual amount : " + actualTotal);
    }

    public void finishButton(){
        finish_id.click();
    }
}
