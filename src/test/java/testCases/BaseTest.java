package testCases;

import driver.DriverConfig;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.LogInPage;
import pages.LoginSelectionPage;
import pages.ProfilePage;
import pages.StartPage;

public class BaseTest {

    public static AndroidDriver driver;
    HomePage homePage;
    LogInPage logInPage;
    LoginSelectionPage loginSelectionPage;
    ProfilePage profilePage;
    StartPage startPage;

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeTest
    protected void setUp() {
        driver = new DriverConfig().createdInstance();
        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        loginSelectionPage = new LoginSelectionPage(driver);
        profilePage = new ProfilePage(driver);
        startPage = new StartPage(driver);
    }
}
