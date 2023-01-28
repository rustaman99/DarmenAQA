package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {
      @FindBy(xpath = "//android.view.View[@content-desc='Абай']")
        public WebElement sityAbbaybutton;


    @FindBy(xpath = "//android.view.View[@content-desc='Пропустить всё']")
    public WebElement skipAll;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Отмена']")
    public WebElement updateAppData;


    public StartPage(AppiumDriver<?> driver) {
        super(driver);
    }
}
