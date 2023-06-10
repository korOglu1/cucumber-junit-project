package com.sydeo.step_definitions;

import com.sydeo.pages.WebTableLoginPage;
import com.sydeo.utilities.ConfigurationReader;
import com.sydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDef {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTableLoginPage.inputUserName.sendKeys(string);

    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTableLoginPage.inputUserPassword.sendKeys(string);

    }
    @When("user click to login button")
    public void user_click_to_login_button() {
        webTableLoginPage.loginButton.click();

    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("order"));

    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
    //    webTableLoginPage.inputUserName.sendKeys(username);
    //    webTableLoginPage.inputUserPassword.sendKeys(password);
    //    webTableLoginPage.loginButton.click();
        webTableLoginPage.login(username,password);

    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
 //       webTableLoginPage.inputUserName.sendKeys(credentials.get("username"));
 //       webTableLoginPage.inputUserPassword.sendKeys(credentials.get("password"));
 //       webTableLoginPage.loginButton.click();

        webTableLoginPage.login(credentials.get("username"),credentials.get("password"));
    }
}
