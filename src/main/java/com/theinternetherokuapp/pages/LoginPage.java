package com.theinternetherokuapp.pages;

import com.cucumber.listener.Reporter;
import com.theinternetherokuapp.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Pradip
 */
public class LoginPage extends Utility {
    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(xpath = "//input[@id='username']")
    WebElement _usernameField;
    @FindBy(xpath = "//input[@id='password']")
    WebElement _passwordField;
    @FindBy(xpath = "//i[contains(text(),'Login')]")
    WebElement _loginFeature;
    @FindBy(xpath = "//div[@id='flash']")
    WebElement _getLoginErrorMessage;

    @FindBy(xpath = "//i[contains(text(),'Logout')]")
    WebElement _logOutFeature;


    @FindBy(xpath = "//h2[contains(text(),'Login Page')]")
    WebElement _getLoginTextMessage;


    /**
     * Method created to do actions on each web element
     */

    public void enterUsername(String username) {
        Reporter.addStepLog("Entering Username" + username + "On username Field" + _usernameField.toString());
        sendTextToElement(_usernameField, username);
        log.info("Entering Username" + username + "On username Field" + _usernameField.toString());
    }

    public void enterPassword(String password) {
        Reporter.addStepLog("Entering Password " + password + "On password Field " + _passwordField.toString());
        sendTextToElement(_passwordField, password);
        log.info("Entering Password " + password + "On Password Field " + _passwordField.toString());
    }

    public void clickOnLogInButton() {
        Reporter.addStepLog("Clicking on Login Button " + _loginFeature.toString());
        clickOnElement(_loginFeature);
        log.info("Clicking on Login Button " + _loginFeature.toString());

    }

    public String getLoginErrorMessage() {
        Reporter.addStepLog("Getting Login error message" + _getLoginErrorMessage.toString());
        log.info("Getting Login error message" + _getLoginErrorMessage.toString());
        return getTextFromElement(_getLoginErrorMessage);
    }

    public void clickOnLogOutButton() {
        Reporter.addStepLog("Clicking on Log out Button " + _logOutFeature.toString());
        clickOnElement(_logOutFeature);
        log.info("Clicking on Log out Button " + _logOutFeature.toString());

    }


    public String getLoginText() {
        Reporter.addStepLog("Getting Login text message" + _getLoginTextMessage.toString());
        log.info("Getting Login text message" + _getLoginTextMessage.toString());
        return getTextFromElement(_getLoginTextMessage);
    }

}
