package com.flairtech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage (WebDriver driver) {
        this.driver= driver  ;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[1]/div[4]/form[1]/div[1]/div[4]/div[2]/button[1]/span[3]")
    public WebElement fifthContinueButton;

}
