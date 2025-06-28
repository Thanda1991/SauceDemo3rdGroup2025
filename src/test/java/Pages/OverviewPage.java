package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OverviewPage {
    WebDriver driver;


    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement overviewTitle_xpath;

    @FindBy(id = "finish")
    WebElement finsh_id;
    public OverviewPage(WebDriver driver) {this.driver = driver;}


        public void verifyoverviewTitle() {
            new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(overviewTitle_xpath));
            overviewTitle_xpath.isDisplayed();
    }
    public void ClickfinishButton() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(finsh_id));
        finsh_id.isDisplayed();
    }


}
