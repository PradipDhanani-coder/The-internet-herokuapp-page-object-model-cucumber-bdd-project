package com.theinternetherokuapp.pages;

import com.cucumber.listener.Reporter;
import com.theinternetherokuapp.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Pradip
 */
public class KeyPressesPage extends Utility {
    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(KeyPressesPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(xpath = "//a[contains(text(),'Key Presses')]")
    WebElement _keyPressesFeature;

    @FindBy(xpath = "//input[@id='target']")
    WebElement _keyPress;

    @FindBy(xpath = "//p[@id='result']")
    WebElement _displayedText;


    /**
     * Method created to do actions on each web element
     */
    public void clickOnKeyPressesFeature() {
        Reporter.addStepLog("Clicking On Key Presses Feature" + _keyPressesFeature.toString());
        clickOnElement(_keyPressesFeature);
        log.info("Clicking On Key Presses Feature" + _keyPressesFeature.toString());
    }

    public void enterKeyPress(String alphabets) {
        Reporter.addStepLog("Entering alphabets" + alphabets + "On key press Field" + _keyPress.toString());
        sendTextToElement(_keyPress, alphabets);
        log.info("Entering alphabets" + alphabets + "On key press Field" + _keyPress.toString());
    }

    public String getDisplayedText() {
        Reporter.addStepLog("Getting Displayed text message" + _displayedText.toString());
        log.info("Getting Displayed text message" + _displayedText.toString());
        return getTextFromElement(_displayedText);
    }

    public void clearText() {
        Reporter.addStepLog("Clear text from field" + _keyPress.toString());
        driver.findElement(By.xpath("//input[@id='target']")).clear();
        log.info("Clear text from field" + _keyPress.toString());
    }


}
