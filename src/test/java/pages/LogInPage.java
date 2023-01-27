package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends  BasePage {

    @FindBy(xpath = "//android.widget.Button[@content-desc='Войти']")
    public WebElement login;

    @FindBy(xpath = "//android.widget.EditText[@text='Email']")
    public  WebElement email;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    public  WebElement password;

    @FindBy(xpath = " //android.view.View[@content-desc='Unable to log in']")
    public  WebElement errorMessage;


    public LogInPage(AppiumDriver<?> driver) {
        super(driver);
    }
}