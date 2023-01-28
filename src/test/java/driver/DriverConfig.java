package driver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverConfig {
    private AndroidDriver<?> driver;
    protected static final Logger log = Logger.getLogger(DriverConfig.class);

    public AndroidDriver<?> createdInstance() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "android");
            capabilities.setCapability("appium:deviceName", "emulator-5554");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sannacode.android.serbiso");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.example.darmen.MainActivity");
//            capabilities.setCapability("appium:app", "/Users/Stanislav_Nazarenko/downloads/
            capabilities.setCapability("appium:app", "C:\\Users\\Ксю\\Desktop\\base (1).apk");
            capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
            capabilities.setCapability(MobileCapabilityType.FULL_RESET,false);
            capabilities.setCapability("appium:ensureWebviewsHavePages", true);
            capabilities.setCapability("appium:nativeWebScreenshot", true);
            capabilities.setCapability("appium:newCommandTimeout", 3600);
            capabilities.setCapability("appium:connectHardwareKeyboard", true);

            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
           log.error("Failed to initialize the tests for the Android device");
        }
        return driver;
    }
}


