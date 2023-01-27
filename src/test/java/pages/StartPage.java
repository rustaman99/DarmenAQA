package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class StartPage extends BasePage {
      @AndroidFindBy(xpath = "//android.view.View[@content-desc='Абай']")
        public MobileElement sityAbbaybutton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Отмена']")
    public MobileElement updateAppData;


    public StartPage(AppiumDriver<?> driver) {
        super(driver);
    }
}
