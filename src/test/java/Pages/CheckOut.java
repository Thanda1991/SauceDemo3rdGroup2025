package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
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
   @FindBy(id = "first-name")
   WebElement firstName_xpath;
   @FindBy(id ="last-name")
   WebElement lastName_xpath;
   @FindBy(id = "postal-code")
   WebElement postalCode_xpath;
   @FindBy(id = "continue")
   WebElement Continue_btn_xpath;



public  CheckOut(WebDriver driver){this.driver =driver;}

public void verifycheckoutDetails(){
   new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutYourInfo_xpath));
   checkoutYourInfo_xpath.isDisplayed();
}

public void enterName(){

   driver.findElement(By.id("first-name")).sendKeys("Shiluva");
   driver.findElement(By.id("last-name")).sendKeys("Mayinga");
   driver.findElement(By.id("postal-code")).sendKeys("6500");
   driver.findElement(By.id("continue")).click();
   driver.findElement(By.xpath("//button[@id='finish']")).click();}
 }



