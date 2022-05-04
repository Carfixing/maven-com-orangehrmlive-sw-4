package com.orangehrmlive.demo_opensource.testbase;
import com.orangehrmlive.demo_opensource.propertyreader.PropertyReader;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

}
