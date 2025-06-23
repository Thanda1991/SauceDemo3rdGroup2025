package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SummaryPage {
    WebDriver driver;

    @FindBy(id = "checkout_summary_container")
    WebElement summaryContainer_id;

    @FindBy(id = "finish")
    WebElement finishButton_id;

    public SummaryPage(WebDriver driver){this.driver = driver;}

    public void verifySummaryContainer() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(summaryContainer_id));
        summaryContainer_id.isDisplayed();}

    public void finishButton_id(){
        finishButton_id.click();}
}
