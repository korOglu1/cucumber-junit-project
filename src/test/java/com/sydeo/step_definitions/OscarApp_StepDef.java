package com.sydeo.step_definitions;

import com.sydeo.pages.OscarAppPage;
import com.sydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OscarApp_StepDef {

    OscarAppPage oscarAppPage = new OscarAppPage();

    @Given("User is on hioscar page")
    public void user_is_on_hioscar_page() {
        Driver.getDriver().get("https://www.hioscar.com/care-options");

    }

    @When("user should click Search network")
    public void user_should_click_search_network() {
        oscarAppPage.searchNetworkBtn.click();


    }

    @When("user from coverage year dropdown Select {int} option")
    public void user_from_coverage_year_dropdown_select_option(Integer int1) {
       // Select select = new Select(oscarAppPage.selectCoverageYear);
        oscarAppPage.selectNetwork.click();
        oscarAppPage.selectCoverageYear.click();

    }

    @When("user coverage access dropdown Select Employer-provided option")
    public void user_coverage_access_dropdown_select_employer_provided_option() {
        oscarAppPage.coverageAccessDropdown.click();
        oscarAppPage.employeeProvidedOption.click();

    }

    @When("user from Network partner dropdown Select Oscar option")
    public void user_from_network_partner_dropdown_select_oscar_option() {
        oscarAppPage.networkPartner.click();
     //   Actions actions = new Actions(Driver.getDriver());
     //   actions.moveToElement(oscarAppPage.oscarOption).click().perform();
     //   JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
     //   js.executeScript("arguments[0].click()",oscarAppPage.oscarOption);
        
        oscarAppPage.oscarOption.click();











    }

    @When("user from Coverage area dropdown Select New Jersey")
    public void user_from_coverage_area_dropdown_select_new_jersey() {
        oscarAppPage.networkPartner.click();
        oscarAppPage.newJerseyOption.click();

    }

    @When("user should click Continue button")
    public void user_should_click_continue_button() {
        oscarAppPage.continueBtn.click();

    }

    @Then("user should verify title contains “Oscar”")
    public void user_should_verify_title_contains_oscar() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Oscar"));

    }
}
