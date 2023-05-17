package appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class CreateDriverSession {

    public static AppiumDriver initializeDriver (String platformName) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        caps.setCapability("newCommandTimeout", 300);

        URL url = new URL("http://0.0.0.0:4723"); // Appium 2.0'dan itibaren wd/hub yolunu yazmaya gerek yok.

        switch (platformName){
            case "Android":
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel_4");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "java" + File.separator + "resources" + File.separator +
                        "ApiDemos-debug.apk";
                caps.setCapability("appPackage", "io.appium.android.apis");
                caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
//                caps.setCapability("unlockType", "pin");
//                caps.setCapability("unlockKey", "1111");
                caps.setCapability("unlockType", "pattern");
                caps.setCapability("unlockKey", "125478963");
//                caps.setCapability("appPackage", "com.google.android.apps.maps");
//                caps.setCapability("appActivity", "com.google.android.maps.MapsActivity");
                return new AndroidDriver(url, caps);
            case "iOS":
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                caps.setCapability(MobileCapabilityType.UDID, "cmd ekranından alınacak");
                String iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "java" + File.separator + "resources" + File.separator +
                        "UIKitCatalog-iphonesimulator.app";
                caps.setCapability("simulatorStartupTimeout", 180000);
                caps.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
                return new IOSDriver(url, caps);
            default:
                throw new Exception("invalid platform");

        }
    }





}
