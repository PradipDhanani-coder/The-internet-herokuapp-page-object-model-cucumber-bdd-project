package com.theinternetherokuapp.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Pradip
 */

/**
 * Web driver initialization to use in all other class
 */
public class BasePage {
    public static WebDriver driver;

    /**
     * Below constructor define with log4j.properties path
     */

    public BasePage() {
        PageFactory.initElements(driver, this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/com/theinternetherokuapp/resources/propertiesfile/log4j.properties");
    }

}
