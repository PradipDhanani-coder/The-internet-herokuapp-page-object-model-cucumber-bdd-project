package com.theinternetherokuapp.cucumber.stepdefs;

import com.theinternetherokuapp.pages.InfiniteScrollPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Pradip
 */
public class InfinitesScrollTest {
    @When("^I click on infinite scroll feature$")
    public void iClickOnInfiniteScrollFeature() {
        new InfiniteScrollPage().clickOnInfiniteScrollFeature();
    }

    @And("^I scroll down twice to bottom of the page$")
    public void iScrollDownTwiceToBottomOfThePage() {
        new InfiniteScrollPage().scrollDown();
        new InfiniteScrollPage().scrollDownTwo();
    }

    @And("^I scroll up to top of the page$")
    public void iScrollUpToTopOfThePage() {
        new InfiniteScrollPage().scrollUp();
    }

    @Then("^I should be able to see infinite scroll text successfully$")
    public void iShouldBeAbleToSeeInfiniteScrollTextSuccessfully() {
        Assert.assertEquals(new InfiniteScrollPage().getInfiniteText(), "Infinite Scroll");
    }

}
