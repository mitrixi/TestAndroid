import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;

public class TestAndroid {

    public static void main(String[] args) {
        AndroidDriver<AndroidElement> driver;
//        SelenideElement buttonDigit5 = $(By.id("com.android.calculator2:id/op_div"));
//        SelenideElement buttonMultiplication = $(By.id("com.android.calculator2:id/op_mul"));
//        SelenideElement buttonEquals = $(By.id("com.android.calculator2:id/eq"));

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Xiaomi Redmi 7");
        capabilities.setCapability("udid", "a6eaa0e2");

//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulatorSamsungGalaxyS6");
//        capabilities.setCapability(MobileCapabilityType.APP, "/home/mitrixi/IdeaProjects/StudioProjects/TestAndroid/src/main/resources/ApiDemos-debug.apk");
//        capabilities.setCapability("appPackage", "com.android.calculator2");
//        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
//        capabilities.setCapability("noReset", "true");

        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

//        buttonDigit5.click();
//        buttonMultiplication.click();
//        buttonDigit5.click();
//        buttonEquals.click();
    }
}
