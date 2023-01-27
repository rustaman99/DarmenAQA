package testCases;

import driver.DriverConfig;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public static AndroidDriver driver;

    @AfterTest(alwaysRun = true)
    public void tearDown(){
        if(driver !=null){
            driver.quit();
        }
    }
    @BeforeTest
    protected void setUp(){
        driver=new DriverConfig().createdInstance();


    }
}
