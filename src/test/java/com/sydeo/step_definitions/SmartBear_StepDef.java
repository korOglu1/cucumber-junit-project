package com.sydeo.step_definitions;

import com.sydeo.pages.SmartBearPage;
import com.sydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDef {

    SmartBearPage smartBearPage = new SmartBearPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomple\n" +
                "te12/WebOrders/login.aspx");

        smartBearPage.inputUserName.sendKeys("Tester");
        smartBearPage.inputPassword.sendKeys("test");
        smartBearPage.loginBtn.click();

    }

    @Given("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
        smartBearPage.orderBtn.click();

    }

    @Given("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {

        Select select = new Select(smartBearPage.productDropdown);

    }

    @Given("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        smartBearPage.quantity.sendKeys(string);


    }

    @Given("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        smartBearPage.customerName.sendKeys(string);

    }

    @Given("User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBearPage.streetName.sendKeys(string);

    }

    @Given("User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBearPage.cityName.sendKeys(string);

    }

    @Given("User enters {string} to state")
    public void user_enters_to_state(String string) {
        smartBearPage.stateName.sendKeys(string);

    }

    @Given("User enters {string}")
    public void user_enters(String string) {
        smartBearPage.zipCode.sendKeys(string);

    }

    @Given("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        smartBearPage.selectVisa.click();

    }

    @Given("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {

        smartBearPage.cartNumber.sendKeys(string);

    }

    @Given("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartBearPage.expireDate.sendKeys(string);

    }

    @Given("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.processButton.click();

    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
     //   Assert.assertTrue();

    }
}
