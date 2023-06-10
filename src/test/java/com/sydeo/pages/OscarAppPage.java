package com.sydeo.pages;

import com.sydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OscarAppPage {

    public OscarAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='Button_content__yNdi7']")
    public WebElement searchNetworkBtn;

    @FindBy(xpath = "//div[@class='Dropdown_visibleContent__NGHUm']")
    public WebElement selectNetwork;

    @FindBy(xpath = "//div[@aria-label='2023']")
    public WebElement selectCoverageYear;

    @FindBy(xpath = "//label[@id='cascading-dropdown-19-Coverage access']")
    public WebElement coverageAccessDropdown;

    @FindBy(xpath = "//div[.='Employer-provided']")
    public WebElement employeeProvidedOption;

    @FindBy(xpath = "//label[@id='cascading-dropdown-19-Network partner']")
    public WebElement networkPartner;

    @FindBy(xpath = "//div[.='Oscar']")
    public WebElement oscarOption;

    @FindBy(xpath = "//label[@id='dropdown-value-49']")
    public WebElement coverageArea;

    @FindBy(xpath = "//div[.='New Jersey']")
    public WebElement newJerseyOption;

    @FindBy(xpath = "//span[.='Continue']")
    public WebElement continueBtn;

}
