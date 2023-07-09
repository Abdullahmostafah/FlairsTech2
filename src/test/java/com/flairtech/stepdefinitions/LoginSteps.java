package com.flairtech.stepdefinitions;

import com.flairtech.pages.LoginPage;
import io.cucumber.java.en.And;

import static com.flairtech.testbases.TestBase.driver;

public class LoginSteps {
    LoginPage login = new LoginPage(driver);

    @And("User clicks on fifth continue")
    public void User_clicks_on_fifth_continue(){
        login.fifthContinueButton.click();
    }
}
