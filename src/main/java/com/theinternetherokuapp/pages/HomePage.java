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

/**
 * Home page class extends to use properties and behaviour of utility class
 */
public class HomePage extends Utility {
    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(linkText = "Form Authentication")
    WebElement _formAuthenticationFeature;


    /**
     * Method created to do actions on each web element
     */
    public void clickOnFormAuthenticationFeature() {
        Reporter.addStepLog("Clicking on form Authentication Feature" + _formAuthenticationFeature.toString());
        clickOnElement(_formAuthenticationFeature);
        log.info("Clicking on form Authentication Feature" + _formAuthenticationFeature.toString());
    }

}