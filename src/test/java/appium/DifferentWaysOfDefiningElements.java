package appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DifferentWaysOfDefiningElements {

    @FindBy (xpath = "//*[@text=\"Accessibility\"]")
    private static WebElement myElement3;

    @AndroidFindBy (accessibility = "Accessibility")
    private static WebElement myElement4;

    public DifferentWaysOfDefiningElements(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        DifferentWaysOfDefiningElements obj = new DifferentWaysOfDefiningElements(driver);

        WebElement myElement = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        System.out.println("myElement: " + myElement.getText());

        By myElement1 = By.xpath("//*[@text=\"Accessibility\"]");
        System.out.println("myElement1: " + driver.findElement(myElement1).getText());

        By myElement2 = AppiumBy.accessibilityId("Accessibility");
        System.out.println("myElement2: " + driver.findElement(myElement2).getText());

        System.out.println("myElement3: " + myElement3.getText());
        System.out.println("myElement4: " + myElement4.getText());

    }
}
