package com.sydeo.step_definitions;

import com.sydeo.pages.BasePage;
import com.sydeo.pages.ViewAllOrderPage;
import com.sydeo.pages.WebTableLoginPage;
import com.sydeo.pages.WebTableOrderPage;
import com.sydeo.utilities.BrowserUtils;
import com.sydeo.utilities.ConfigurationReader;
import com.sydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_StepDef {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();
    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();
    ViewAllOrderPage viewAllOrderPage = new ViewAllOrderPage();

    Select select;

    @Given("user is already logged in and  on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        webTableLoginPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
        basePage.orderButtonNavItem.click();

    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {

        select = new Select(webTableOrderPage.productTypeDropdown);
        select.selectByVisibleText(string);

    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
        // default there was already number in this input
        // first we need to clean that input, than we will send keys

      //  webTableOrderPage.inputQuantity.clear();
        webTableOrderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);

        // accepting int arg and sending text using sendKeys() method
        // since sendKeys() method only accept String, we need to either concat with ""
 //       webTableOrderPage.inputQuantity.sendKeys(int1 + "");
        // or send String.valueOf(int)
        webTableOrderPage.inputQuantity.sendKeys(String.valueOf(int1));

    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        webTableOrderPage.inputName.sendKeys(string);

    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {
        webTableOrderPage.inputStreet.sendKeys(string);

    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {
        webTableOrderPage.inputCity.sendKeys(string);

    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {
        webTableOrderPage.inputState.sendKeys(string);

    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        webTableOrderPage.inputZip.sendKeys(string);

    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
 //       for (WebElement each : webTableOrderPage.cardType) {
 //           if(each.getAttribute("value").equalsIgnoreCase(string)){
 //               each.click();
 //           }
 //       }
        BrowserUtils.clickRadioButton(webTableOrderPage.cardType,string);

    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        webTableOrderPage.inputCardNo.sendKeys(string);

    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        webTableOrderPage.inputCardExp.sendKeys(string);

    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOrderPage.processOrderButton.click();

    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedCustomerName) throws InterruptedException {
        String actualCustomerName = viewAllOrderPage.newCustomerCell.getText();
        Assert.assertEquals(expectedCustomerName,actualCustomerName);
        Thread.sleep(5000);

    }


}
