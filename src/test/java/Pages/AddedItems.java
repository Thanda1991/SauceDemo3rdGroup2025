package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddedItems {
  WebDriver driver;
  //example
  @FindBy(xpath = "//span[contains(.,'Your Cart')]")
  WebElement AddedItems_xpath;
  @FindBy(id = ("checkout"))
  WebElement CheckoutAddedItems_id;

  //Object for the class AddedItem
  public AddedItems (WebDriver driver){ this.driver =driver; }

    //Locating the Element for the Tittle Your Cart
    public void verifyAddedItems() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(AddedItems_xpath));
        AddedItems_xpath.isDisplayed();
    }
    //Locating The element for check out
     public void CheckoutAddedItems(){
         CheckoutAddedItems_id.click();

  }


  }















