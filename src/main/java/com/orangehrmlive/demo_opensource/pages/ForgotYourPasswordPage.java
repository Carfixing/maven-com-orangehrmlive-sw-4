package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgotYourPasswordPage extends Utility {

    By verifyText = By.xpath("//a[text() = 'Forgot your password?']");
    By forgotYourPasswordButton = By.linkText("Forgot your password?");

    public String verifyTextforgotYourPassword(){
        return getTextFromElement(verifyText);
    }

    public void clickOnForgotYourPasswordButton(){
        clickOnElement(forgotYourPasswordButton);
    }
}
