package com.flairtech.testrunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/features",
                glue = "com.flairtech.stepdefinitions",
                tags = "@smoke",
                plugin = { "pretty",
                        "html:target/cucumber.html",
                        "json:target/cucumber.json",
                        "junit:target/cukes.xml",
                        "rerun:target/rerun.txt"}
        )
//Change Tagname to Test1 to run registration feature
//Change Tagname to Test2 to run Shopping feature
//Change Tagname to smoke to run both
// DON'T FORGET TO CHANGE EMAIL ADDRESS IN BOTH FEATURE FILES
public class TestRunner extends AbstractTestNGCucumberTests {
}