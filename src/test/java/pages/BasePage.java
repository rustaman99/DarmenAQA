package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

public class BasePage {
    private AppiumDriver driver;

    public BasePage(AppiumDriver<?> driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    private void fluentWait(MobileElement element,long timeout){
        Wait wait =new AppiumFluentWait(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(java.util.NoSuchElementException.class,StaleElementReferenceException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForElementToBePresent(WebElement element,String errorMessage,long timeOutInSeconds){
        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(timeOutInSeconds))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class)
                .ignoring(TimeoutException.class)
                .withMessage(errorMessage);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
public WebElement waitForElementToBeClickable(WebElement element,String errorMessage,long timeInSeconds){
    WebDriverWait wait=new WebDriverWait(driver,timeInSeconds);
    wait.withMessage(errorMessage + "\n");
    try {
        return wait.until(
                ExpectedConditions.elementToBeClickable(element));
    }catch (StaleElementReferenceException e){
        return wait.until(ExpectedConditions.elementToBeClickable(element));

    }
 }
}
