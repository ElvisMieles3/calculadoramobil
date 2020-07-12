package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver implements DriverSource {

    @Override
    public WebDriver newDriver() {
        AppiumDriver<MobileElement> driver = null;
        String serverUrl = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");    // este valor varía dependiendo del dispositivo
        capabilities.setCapability("platformVersion","9");        // este valor varía dependiendo del dispositivo
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("deviceName", "ZY2277N7ZN");   // este valor varía dependiendo del dispositivo
        capabilities.setCapability("appPackage", "com.google.android.calculator");  // este valor varía dependiendo del dispositivo
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");   // este valor varía dependiendo del dispositivo
        try {
        	driver = new AndroidDriver(new URL(serverUrl), capabilities);
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
