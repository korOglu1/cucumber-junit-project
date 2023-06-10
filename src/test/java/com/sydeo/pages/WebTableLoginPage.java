package com.sydeo.pages;

import com.sydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name = "username")
    public WebElement inputUserName;

    @FindBy(name = "password")
    public WebElement inputUserPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    /**
     * This method will accept username and password and login to app
     * @param username
     * @param password
     */
    public void login (String username, String password){
        inputUserName.sendKeys(username);
        inputUserPassword.sendKeys(password);
        loginButton.click();
    }


}
