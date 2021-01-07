package com.theinternetherokuapp.cucumber.stepdefs;

import com.theinternetherokuapp.pages.HomePage;
import com.theinternetherokuapp.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Pradip
 */
public class LoginTest {
    @Given("^I am on the internet herokuapp home page$")
    public void iAmOnTheInternetHerokuappHomePage() {
    }

    @When("^I click on Form authentication feature$")
    public void iClickOnFormAuthenticationFeature() {
        new HomePage().clickOnFormAuthenticationFeature();
    }


    @Then("^I should be on Login page successfully$")
    public void iShouldBeOnLoginPageSuccessfully() {
        Assert.assertEquals(new LoginPage().getLoginText(), "Login Page");

    }

    @When("^I enter correct username in username field \"([^\"]*)\"$")
    public void iEnterCorrectUsernameInUsernameField(String username) {
        new HomePage().clickOnFormAuthenticationFeature();
        new LoginPage().enterUsername(username);
    }

    @And("^I enter incorrect password in password field \"([^\"]*)\"$")
    public void iEnterIncorrectPasswordInPasswordField(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on Login in feature$")
    public void iClickOnLoginInFeature() {
        new LoginPage().clickOnLogInButton();
    }


    @Then("^I should be not login to system and verify errorMessage$")
    public void iShouldBeNotLoginToSystemAndVerifyErrorMessage() {

        String ExpectedResult = "Your password is invalid!\n" +
                "×";
        String ActualResult = new LoginPage().getLoginErrorMessage();
        Assert.assertEquals(ExpectedResult, ActualResult);


    }


    @When("^I enter incorrect username in username field \"([^\"]*)\"$")
    public void iEnterIncorrectUsernameInUsernameField(String invalidUsername) {
        new HomePage().clickOnFormAuthenticationFeature();
        new LoginPage().enterUsername(invalidUsername);

    }

    @And("^I enter correct password in password field \"([^\"]*)\"$")
    public void iEnterCorrectPasswordInPasswordField(String validPassword) {
        new LoginPage().enterPassword(validPassword);

    }


    @Then("^I should be not login to system and verify errorMessages$")
    public void iShouldBeNotLoginToSystemAndVerifyErrorMessages() {
        String ExpectedResult = "Your username is invalid!\n" +
                "×";
        String ActualResult = new LoginPage().getLoginErrorMessage();
        Assert.assertEquals(ExpectedResult, ActualResult);
    }


    @Then("^I should be on Login successfully and logout successfully$")
    public void iShouldBeOnLoginSuccessfullyAndLogoutSuccessfully() {
        new LoginPage().clickOnLogOutButton();

    }

    @And("^I enter correct username in username fields \"([^\"]*)\"$")
    public void iEnterCorrectUsernameInUsernameFields(String username) {
        new LoginPage().enterUsername(username);

    }

    @And("^I enter correct password in password fields \"([^\"]*)\"$")
    public void iEnterCorrectPasswordInPasswordFields(String validPassword) {
        new LoginPage().enterPassword(validPassword);

    }
}

