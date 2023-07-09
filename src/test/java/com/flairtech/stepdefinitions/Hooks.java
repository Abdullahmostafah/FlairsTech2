package com.flairtech.stepdefinitions;

import com.flairtech.testbases.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase {


    @Before
    public static void openBrowser(){
        initBrowser();
        driver.navigate().to(URL);
    }

    @After
    public static void quitBrowser () throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
