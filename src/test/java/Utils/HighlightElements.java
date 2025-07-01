package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Utils.BrowserFactory.driver;

public class HighlightElements {

    public static void highlight(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll the element into view first
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        // Scroll up slightly (adjust -150 as needed)
        js.executeScript("window.scrollBy(0, -150);");

        // Apply red border highlight
        js.executeScript("arguments[0].style.border='3px solid red';", element);
    }
}
