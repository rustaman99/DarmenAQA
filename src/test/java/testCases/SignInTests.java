package testCases;


import org.testng.annotations.Test;

public class SignInTests extends BaseTest{

    @Test
    public void testUserLogin() throws InterruptedException {
//        Thread.sleep(10000);
//        startPage.sityAbbaybutton.click();
//        Thread.sleep(5000);
//        startPage.updateAppData.click();
        Thread.sleep(5000);
        homePage.profile.click();
        profilePage.loginElement.click();
        loginSelectionPage.loginPage.click();
        logInPage.email.sendKeys("nazarenko.ruslan@ukr.net");
        logInPage.password.sendKeys("rustaman99");
        logInPage.login.click();


    }
}
