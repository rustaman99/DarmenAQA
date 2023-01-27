package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSelectionPage extends BasePage {
    @FindBy(xpath = "//android.widget.Button[@content-desc='ВОЙТИ']")
    public WebElement loginPage;

    public LoginSelectionPage(AppiumDriver<?> driver) {
        super(driver);
    }
}
