package com.sydeo.pages;

import com.sydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {

    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "ctl00_MainContent_username")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderBtn;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropdown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement selectVisa;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cartNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate;

    @FindBy(xpath = "//a[@class='btn_light']")
    public WebElement processButton;



}
