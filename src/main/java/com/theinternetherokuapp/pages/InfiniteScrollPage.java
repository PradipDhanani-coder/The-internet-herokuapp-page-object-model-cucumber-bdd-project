package com.theinternetherokuapp.pages;

import com.cucumber.listener.Reporter;
import com.theinternetherokuapp.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.rmi.CORBA.Util;

/**
 * Created by Pradip
 */
public class InfiniteScrollPage extends Utility {

    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(InfiniteScrollPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(xpath = "//a[contains(text(),'Infinite Scroll')]")
    WebElement _infiniteScrollFeature;

    @FindBy(xpath = "//h3[contains(text(),'Infinite Scroll')]")
    WebElement _getInfiniteText;


    public void clickOnInfiniteScrollFeature() {
        Reporter.addStepLog("Clicking on Infinite Scroll Feature" + _infiniteScrollFeature.toString());
        clickOnElement(_infiniteScrollFeature);
        log.info("Clicking on Infinite Scroll Feature" + _infiniteScrollFeature.toString());
    }

    public void scrollDown() {
        Reporter.addStepLog("scroll Down window ");
        windowScroll();
        log.info("scroll Down window ");
    }

    public void scrollDownTwo() {
        Reporter.addStepLog("scroll Down window ");
        windowScrollTwo();
        log.info("scroll Down window ");
    }

    public void scrollUp() {
        Reporter.addStepLog("scroll up window ");
        windowScrollUp();
        log.info("scroll up window ");
    }

    public String getInfiniteText() {
        Reporter.addStepLog("Getting Infinite text message" + _getInfiniteText.toString());
        log.info("Getting Infinite text message" + _getInfiniteText.toString());
        return getTextFromElement(_getInfiniteText);
    }
}