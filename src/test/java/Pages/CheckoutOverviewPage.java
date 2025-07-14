package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

import static Utils.HighlightElements.highlight;

public class CheckoutOverviewPage {
    @FindBy(className = "title")
    WebElement checkoutOverviewTitle;

    @FindBy(id = "finish")
    WebElement finish_id;

    @FindBy(className = "inventory_item_price")
    List<WebElement> itemPrices;

    @FindBy(className = "summary_subtotal_label")
    WebElement subTotalLabel;

    @FindBy(className = "summary_tax_label")
    WebElement taxLabel;

    @FindBy(className = "summary_total_label")
    WebElement totalLabel;

    public void VerifyCheckoutOverviewTitle() {
        String actualTitle = checkoutOverviewTitle.getText();
        Assert.assertTrue(actualTitle.contains("Checkout: Overview"),
                "Expected title to contain 'Checkout: Overview' but got: " + actualTitle);
        highlight(checkoutOverviewTitle);
    }

    public void verifyTotalPaymentAmount() {
        double itemTotal = 0;
        for (WebElement price : itemPrices) {
            itemTotal += Double.parseDouble(price.getText().replace("$", ""));
        }

        double displayedItemTotal = Double.parseDouble(subTotalLabel.getText().replace("Item total: $", ""));
        double tax = Double.parseDouble(taxLabel.getText().replace("Tax: $", ""));
        double total = Double.parseDouble(totalLabel.getText().replace("Total: $", ""));

        // 🔍 Highlight the total amount
        highlight(totalLabel);

        System.out.println("Item total calculated: " + itemTotal);
        System.out.println("Displayed subtotal: " + displayedItemTotal);
        System.out.println("Displayed tax: " + tax);
        System.out.println("Displayed total: " + total);

        // Assertions without rounding
        Assert.assertEquals(itemTotal, displayedItemTotal, 0.0001, "Mismatch in item total calculation");
        Assert.assertEquals(displayedItemTotal + tax, total, 0.0001, "Mismatch in final total calculation");
    }



    public void ClickFinishButton(){
        finish_id.click();

    }



}
