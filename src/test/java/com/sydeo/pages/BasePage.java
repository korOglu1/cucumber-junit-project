package com.sydeo.pages;

import com.sydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

public BasePage(){
    PageFactory.initElements(Driver.getDriver(),this);
  }


  @FindBy(xpath = "//button[.='View all orders']")
  public WebElement viewAllOrderButtonNav;

  @FindBy(xpath = "//button[.='View all products']")
    public WebElement vewAllProductsButtonNav;

  @FindBy(xpath ="//button[.='Order']" )
    public WebElement orderButtonNavItem;

  @FindBy(xpath = "//button[@class='button __logout']")
    public WebElement logoutButton;


}
