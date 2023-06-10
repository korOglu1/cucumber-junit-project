package com.sydeo.utilities;

import com.sun.jna.WString;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class BrowserUtils {
    // Methods are static, because we don't want to create an object to call those methods.
    // We just want to call those methods with class name. That's why they are static type

    public static void switchWindowAndVerify(String expectedInUrl, String expectedTitle){

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for(String eachWindow : allWindowHandles){
            //driver.switchTo().window(eachWindow);syntax will switch each windows and driver will be able to
            Driver.getDriver().switchTo().window(eachWindow);
         //   System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }
//           5. Assert: Title contains "Etsy"
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title verification failed!", actualTitle.contains(expectedTitle));
    }

    /**
     * This method is used to pause the code for given seconds
     * it's static method we can call with class name
     * BrowserUtils.sleep(3)
     * @param seconds
     */
    public static void sleep(int seconds){
        // 1 second = 1000 mills
        // millis = seconds * 1000
        try{
            Thread.sleep(seconds * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }
    }
    // 2. Create a method for title verification
    //3. Create a method to make title verification logic re-usable    4.
    //When method is called, it should simply verify expected title
    //with actual title.
    //Method info:
    //• Name: verifyTitle()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedTitle

    // BrowserUtil.verifyTitle(driver, "Google"
    public static void verifyTitle(String expectedTitle ){

        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());


    }

    public static void waitForInvisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.invisibilityOf(element));

    }

    /**
     * This method will accept dropdown as a WebElement
     * and return all the option's text in a List of String
     * @return List<String>
     */

    public static List<String> dropdownOptionAsString(WebElement dropdownElement){
        Select select = new Select(dropdownElement);

        // List of all ACTUAL month <options> as a WebElement
        List<WebElement> actualOptionAsWebElement = select.getOptions();

        // List of all ACTUAL month <options> as a String
        List<String> actualOptionAsString = new ArrayList<>();

        // with using for loop we will convert each WebElement of options to String with using getText() method
        // with using add() method we will add each String option in List<String> actual option as a String
        for(WebElement each : actualOptionAsWebElement){
            actualOptionAsString.add(each.getText());
        }

        return actualOptionAsString;
    }




  


    /**
     * This method will accept a group of radio buttons as a List<WebElement>
     *  It will loop through the List and click to the radio button with provided attribute value
     * @param radioButtons
     * @param attributeValue
     */
    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue){
        for (WebElement each : radioButtons) {
            if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }

    }
}
