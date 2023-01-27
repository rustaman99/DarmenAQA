package testCases;

import org.junit.Test;
import pages.*;

public class SignInTests extends BaseTest{
 HomePage homePage=new HomePage(driver);
 LogInPage logInPage = new LogInPage(driver);
 LoginSelectionPage loginSelectionPage = new LoginSelectionPage(driver);
 ProfilePage profilePage=new ProfilePage(driver);
 StartPage startPage=new StartPage(driver);



    @Test
    public void testUserLogin(){
        startPage.sityAbbaybutton.click();
        startPage.updateAppData.click();
        homePage.profile.click();
        profilePage.loginSelectionPage.click();
        loginSelectionPage.loginPage.click();
        logInPage.email.sendKeys("nazarenko.ruslan@ukr.net");
        logInPage.password.sendKeys("rustaman99");
        logInPage.login.click();


    }
}
