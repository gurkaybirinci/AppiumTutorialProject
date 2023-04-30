package appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class FetchElementAttributes {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");

        By accessibility = AppiumBy.accessibilityId("Accessibility");
        System.out.println("text: " + driver.findElement(accessibility).getText());
        System.out.println("text: " + driver.findElement(accessibility).getAttribute("text"));
        System.out.println("checked: " + driver.findElement(accessibility).getAttribute("checked"));
        System.out.println("enabled: " + driver.findElement(accessibility).getAttribute("enabled"));
        System.out.println("selected: " + driver.findElement(accessibility).getAttribute("selected"));
        System.out.println("displayed: " + driver.findElement(accessibility).getAttribute("displayed"));

        System.out.println("selected: " + driver.findElement(accessibility).isSelected());
        System.out.println("enabled: " + driver.findElement(accessibility).isEnabled());
        System.out.println("displayed: " + driver.findElement(accessibility).isDisplayed());

        System.out.println("tagName: " + driver.findElement(accessibility).getTagName());
        System.out.println("size: " + driver.findElement(accessibility).getSize());
//        System.out.println("AriaRole: " + driver.findElement(accessibility).getAriaRole());
        System.out.println("Rect: " + driver.findElement(accessibility).getRect());
//        System.out.println("AccessibleName: " + driver.findElement(accessibility).getAccessibleName());
        System.out.println("Location: " + driver.findElement(accessibility).getLocation());
//        System.out.println("ShadowRoot: " + driver.findElement(accessibility).getShadowRoot());
        System.out.println("Class: " + driver.findElement(accessibility).getClass());

    }
}
