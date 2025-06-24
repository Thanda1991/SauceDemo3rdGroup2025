package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOut {
   WebDriver driver;

   @FindBy(xpath = "//div[@id='header_container']/div[2]/span")
   WebElement checkoutYourInfo_xpath;


public  CheckOut(WebDriver driver){this.driver =driver;}

public void verifycheckoutDetails(){
   new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutYourInfo_xpath));
   checkoutYourInfo_xpath.isDisplayed();
}







}
