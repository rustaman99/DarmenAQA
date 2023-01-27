package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginSelectionPage extends BasePage {
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='ВОЙТИ']")
    public MobileElement loginPage;

    public LoginSelectionPage(AppiumDriver<?> driver) {
        super(driver);
    }
}
