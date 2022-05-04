package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.ForgotYourPasswordPage;
import com.orangehrmlive.demo_opensource.pages.HomeLoginPage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPage extends TestBase {
    HomeLoginPage homeLoginPage = new HomeLoginPage();
    ForgotYourPasswordPage forgotYourPasswordPage  = new ForgotYourPasswordPage();

    @Test
    public void  userSholdLoginSuccessfullyWithValidCredentials(){
        homeLoginPage.enterEmail("Admin");
        homeLoginPage.enterPassword("admin123");
        homeLoginPage.clickOnLoginButton();
        String expectedMessage = "Welcome";
        String actualMessage = homeLoginPage.verifyTheWelcomeTextIsDisplay();
        Assert.assertEquals(expectedMessage, actualMessage, "WelcomeText is not match");
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        String expectedMessage = "Forgot your password?";
        String actualMessage = forgotYourPasswordPage.verifyTextforgotYourPassword();
        Assert.assertEquals(expectedMessage, actualMessage, "Text is Match");
        forgotYourPasswordPage.clickOnForgotYourPasswordButton();
    }
}
