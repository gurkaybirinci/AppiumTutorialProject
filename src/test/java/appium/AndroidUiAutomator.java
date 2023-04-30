package appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class AndroidUiAutomator {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");

        WebElement myElement = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")"));
//        By myElement1 = AppiumBy.androidUIAutomator(""); // Üstteki satır yerine bu satırdaki kod da kullanılabilir.
        System.out.println(myElement.getText());

        myElement = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.TextView\")")).get(2);
        System.out.println(myElement.getText());

        myElement = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Accessibility\")"));
        System.out.println(myElement.getText());

        myElement = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).get(1);
        System.out.println(myElement.getText());

        System.out.print("Metot ile çağrılan locator: ");
        uiSelector(driver,"text", "Accessibility");

    }

    public static void uiSelector(AppiumDriver driver, String uiSelector, String value){
        WebElement myElement = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector()."+uiSelector+"(\""+value+"\")"));
        System.out.println(myElement.getText());
    }
}
