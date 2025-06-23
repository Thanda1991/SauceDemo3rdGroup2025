package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourInformationPage {
    WebDriver driver;
    @FindBy(id = "")
    WebElement YourInfo_xpath;

    @FindBy(id = "first-name")
    WebElement Fname_xpath;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement Lname_xpath;

    @FindBy(id = "postal-code")
    WebElement PostalAddrss_id;


    public YourInformationPage(WebDriver driver) {
        this.driver = driver;
    }


    public void EnterFirstname(String firstname) {Fname_xpath.sendKeys(firstname);}

    public void EnterLastname(String lastname) {
        Lname_xpath.sendKeys(lastname);
    }

    public void EnterPostaladdress(String Postal) {PostalAddrss_id.sendKeys(Postal);}
}
