package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage extends BasePage {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Войти']")
    public MobileElement loginSelectionPage;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Rusik Nazarenko']")
    public MobileElement userNameProfile;


    public ProfilePage(AppiumDriver<?> driver) {
        super(driver);
    }
}