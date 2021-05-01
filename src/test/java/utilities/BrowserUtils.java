package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class BrowserUtils {

    public static void selectDropdownByValue (WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

     // This method waits for element to be clickable.
    public static WebElement waitElementToBeClickable (WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), seconds);
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
        return element1;
    }

     // This method waits for element to be visible.
    public static WebElement waitElementToBeVisible (WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), seconds);
        WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
        return element1;
    }

    // This method helps to switch to another window.
    public static void switchWindow () {
        WebDriver driver = Driver.getDriver();
        String currentWindowID = driver.getWindowHandle();
        Set <String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (!currentWindowID.equals(window)) {
                driver.switchTo().window(window);
            }
        }
    }

    // This method scrolls down and up.
    public static void scroll (int pixels) {
        WebDriver driver = Driver.getDriver();
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollBy(0," + pixels + ")");
    }

    //This method takes screenshot.
    public static void takeScreenshot (String testName) throws IOException {
        WebDriver driver = Driver.getDriver();
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path = "src/test/resources/screenshots/" + testName + ".png";
        File file = new File(path);
        FileUtils.copyFile(screenshot, file);
    }
}
