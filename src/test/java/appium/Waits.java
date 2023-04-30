package appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        By app = AppiumBy.accessibilityId("App");
        By alertDialogs = AppiumBy.accessibilityId("Alert Dialogs");
        By okCancel = AppiumBy.accessibilityId("OK Cancel dialog with a message");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(app)).click();
//        driver.findElement(app).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(alertDialogs)).click();
//        driver.findElement(alertDialogs).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(okCancel)).click();
//        driver.findElement(okCancel).click();


    }
}
