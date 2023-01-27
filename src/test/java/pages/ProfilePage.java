package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

    @FindBy(xpath = "//android.view.View[@content-desc='Войти']")
    public WebElement loginElement;

    @FindBy(xpath = "//android.view.View[@content-desc='Rusik Nazarenko']")
    public WebElement userNameProfile;


    public ProfilePage(AppiumDriver<?> driver) {
        super(driver);
    }
}