package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionUsingOptions {
    public static void main(String[] args) throws MalformedURLException {
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "java" + File.separator + "resources" + File.separator +
                "ApiDemos-debug.apk";
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("pixel_4");
        options.setAutomationName("UiAutomator2");
        options.setApp(appUrl);

        URL url = new URL("http://0.0.0.0:4723"); // Appium 2.0'dan itibaren wd/hub yolunu yazmaya gerek yok.

        AppiumDriver driver = new AndroidDriver(url, options);


        /*
            adb shell
            dumpsys window | grep -E mCurrentFocus
        */

    }
}
