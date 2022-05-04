package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class HomeLoginPage extends Utility {
    By emailIdField = By.id("txtUsername");
    By passWordField = By.id("txtPassword");
    By logInButton = By.id("btnLogin");
   // By verifyText = By.partialLinkText("welcome");
    By verifyText = By.xpath("//a[@id='welcome']");

    public void enterEmail(String email){
        sendTextToElement(emailIdField,email);
    }

    public void enterPassword(String passWord){
        sendTextToElement(passWordField,passWord);
    }

    public void clickOnLoginButton(){
        clickOnElement(logInButton);
    }

    public String verifyTheWelcomeTextIsDisplay(){
        return getTextFromElement(verifyText);
    }

}

