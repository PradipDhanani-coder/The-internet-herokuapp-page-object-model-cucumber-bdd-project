package com.theinternetherokuapp.utility;


import com.theinternetherokuapp.basepage.BasePage;
import org.openqa.selenium.*;


/**
 * Created by Pradip
 */

/**
 * Utility class is stored with reusable methods and extends with base page class to use
 * properties and behaviour of utility class
 */
public class Utility extends BasePage {

    WebElement elem;

    public void windowScroll() {
        elem = driver.findElement(By.tagName("html"));
        elem.sendKeys(Keys.END);

    }

    public void windowScrollTwo() {

        elem = driver.findElement(By.tagName("html"));
        elem.sendKeys(Keys.END);

    }

    public void windowScrollUp() {

        elem = driver.findElement(By.tagName("html"));
        elem.sendKeys(Keys.PAGE_UP);

    }

    /**
     * This method will click on element
     */
    public void clickOnElement(WebElement element) {
        element.click();
    }

    /**
     * This method will return text from element
     */

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will send text to element
     */

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }


}
