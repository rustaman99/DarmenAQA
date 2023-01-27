package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LogInPage extends  BasePage {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Войти']")
    public MobileElement login;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email']")
    public  MobileElement email;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    public  MobileElement password;

    @AndroidFindBy(xpath = " //android.view.View[@content-desc='Unable to log in']")
    public  MobileElement errorMessage;


    public LogInPage(AppiumDriver<?> driver) {
        super(driver);
    }
}