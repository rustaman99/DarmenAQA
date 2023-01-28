package testCases;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTests extends BaseTest{

    @Test
    public void checkingAccountLoginWithCorrectEmailAndPassword605() throws InterruptedException {
//        Thread.sleep(10000);
//        startPage.sityAbbaybutton.click();
//          Thread.sleep(5000);
//        startPage.skipAll.click();
//        startPage.updateAppData.click();
        homePage.waitForElementToBeClickable(homePage.profile,"Елемент не найден",5000).click();
        profilePage.loginElement.click();
        loginSelectionPage.loginPage.click();
        logInPage.email.click();
        logInPage.email.sendKeys("nazarenko.ruslan@ukr.net");
        logInPage.password.click();
        logInPage.waitForElementToBeClickable(logInPage.password,"Елемент не найден",5000).sendKeys("rustaman99");
        logInPage.waitForElementToBeClickable(logInPage.login,"Елемент не найден",5000).click();
        homePage.waitForElementToBeClickable(homePage.profile,"Елемент не найден",5000).click();
        Assert.assertTrue(profilePage.userNameProfile.isDisplayed());

    }
    @Test
    public void checkingTheAbilityToLogInWhenEnteringInvalidDataInTheEmailField609() throws InterruptedException {
        homePage.waitForElementToBeClickable(homePage.profile,"Елемент не найден",5000).click();
        profilePage.loginElement.click();
        loginSelectionPage.loginPage.click();
        logInPage.email.click();
        logInPage.email.sendKeys("nazarenko.ruslan");
        logInPage.password.click();
        logInPage.waitForElementToBeClickable(logInPage.password,"Елемент не найден",5000).sendKeys("rustaman99");
        logInPage.waitForElementToBeClickable(logInPage.login,"Елемент не найден",5000).click();
        logInPage.waitForElementToBePresent(logInPage.errorMessage,"",5000);
        Assert.assertTrue(logInPage.errorMessage.isDisplayed());
    }
    @Test
    public void сheckingtheAbilityToAuthenticateWhenEnteringAnInvalidPassword610() throws InterruptedException {
        homePage.waitForElementToBeClickable(homePage.profile,"Елемент не найден",5000).click();
        profilePage.loginElement.click();
        loginSelectionPage.loginPage.click();
        logInPage.email.click();
        logInPage.email.sendKeys("nazarenko.ruslan");
        logInPage.password.click();
        logInPage.waitForElementToBeClickable(logInPage.password,"Елемент не найден",5000).sendKeys("rustaman9");
        logInPage.waitForElementToBeClickable(logInPage.login,"Елемент не найден",5000).click();
        logInPage.waitForElementToBePresent(logInPage.errorMessage,"",5000);
        Assert.assertTrue(logInPage.errorMessage.isDisplayed());
    }
}
