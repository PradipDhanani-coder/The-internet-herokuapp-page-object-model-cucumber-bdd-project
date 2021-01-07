package com.theinternetherokuapp.cucumber.stepdefs;

import com.theinternetherokuapp.pages.KeyPressesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


/**
 * Created by Pradip
 */
public class KeyPressTest {

    @And("^I click on key presses link$")
    public void iClickOnKeyPressesLink() {
        new KeyPressesPage().clickOnKeyPressesFeature();
    }


    @When("^I press A keys in field \"([^\"]*)\"$")
    public void iPressAKeysInField(String A) {
        new KeyPressesPage().enterKeyPress(A);

    }

    @Then("^System should shows displayed A successfully$")
    public void systemShouldShowsDisplayedASuccessfully() {
        Assert.assertEquals(new KeyPressesPage().getDisplayedText(), "You entered: A");
        new KeyPressesPage().clearText();
    }

    @And("^I press B keys in field \"([^\"]*)\"$")
    public void iPressBKeysInField(String B) {
        new KeyPressesPage().enterKeyPress(B);

    }

    @And("^System should shows displayed B successfully$")
    public void systemShouldShowsDisplayedBSuccessfully() {
        Assert.assertEquals(new KeyPressesPage().getDisplayedText(), "You entered: B");
        new KeyPressesPage().clearText();
    }

    @And("^I press C keys in field \"([^\"]*)\"$")
    public void iPressCKeysInField(String C) {
        new KeyPressesPage().enterKeyPress(C);

    }

    @And("^System should shows displayed C successfully$")
    public void systemShouldShowsDisplayedCSuccessfully() {
        Assert.assertEquals(new KeyPressesPage().getDisplayedText(), "You entered: C");
        new KeyPressesPage().clearText();
    }

    @And("^And I press D keys in field \"([^\"]*)\"$")
    public void andIPressDKeysInField(String D) {
        new KeyPressesPage().enterKeyPress(D);
    }

    @Then("^System should shows displayed D successfully$")
    public void systemShouldShowsDisplayedDSuccessfully() {
        Assert.assertEquals(new KeyPressesPage().getDisplayedText(), "You entered: D");

    }
}
