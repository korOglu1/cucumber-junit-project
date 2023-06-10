package com.sydeo.pages;

import com.sydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrderPage extends BasePage{

    public ViewAllOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

 //@FindBy(xpath = "//tbody/tr[1]/td[1]")  also working
    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement newCustomerCell;
}
