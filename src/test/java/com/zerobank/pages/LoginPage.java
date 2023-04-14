package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "button#signin_button")
    @CacheLookup
    private WebElement signInButton;

    @FindBy(css = "input#user_login")
    @CacheLookup
    private WebElement usernameInputBox;

    @FindBy(css = "#user_password")
    @CacheLookup
    private WebElement passwordInputBox;

    @FindBy(xpath = "//input[@type='submit']")
    @CacheLookup
    private WebElement signInButtonToLogin;

    @FindBy(xpath = "//i[@class='icon-user']/..")
    @CacheLookup
    private WebElement userNameOnLoginPage;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    @CacheLookup
    private WebElement errorMessage;

    public void tapOnSignInButton(){
        BrowserUtils.clickWithJS(signInButton);
    }

    public void enterUserNameAndPassword(String s1, String s2){
        BrowserUtils.sendKeys(usernameInputBox,s1);
        BrowserUtils.sendKeys(passwordInputBox,s2);
    }

    public void tapOnSignInButtonToLogin(){
        BrowserUtils.clickWithJS(signInButtonToLogin);
    }

    public String getUserNameTextOnLoginPage(){
        return userNameOnLoginPage.getText();
    }

    public String getErrorMessageText(){
        return errorMessage.getText();
    }

}