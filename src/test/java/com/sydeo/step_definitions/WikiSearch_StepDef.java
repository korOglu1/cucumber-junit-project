package com.sydeo.step_definitions;

import com.sydeo.pages.WikiSearchPage;
import com.sydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiSearch_StepDef {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");

    }

    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {

    wikiSearchPage.searchBox.sendKeys("Steve Jobs");

    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchButton.click();

    }

    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {

        Assert.assertTrue("Title verification is Failed!", Driver.getDriver().getTitle().contains("Steve Jobs"));

    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchKeyWord) {
        wikiSearchPage.searchBox.sendKeys(searchKeyWord);

    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }
}
