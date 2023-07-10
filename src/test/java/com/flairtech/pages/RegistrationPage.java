package com.flairtech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.flairstech.testbases.TestBase.*;

public class RegistrationPage {
    WebDriver driver;
    public RegistrationPage(WebDriver driver) {
        this.driver= driver  ;
        PageFactory.initElements(driver, this);
    }

    public  void homePage(){
        driver.navigate().to(URL);
    }

    @FindBy(xpath = "//body/div[@id='jm']/div[@id='pop']/div[1]/section[1]/button[1]")
     public WebElement closePopup;

    public void closePopup(){
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();
    }

    @FindBy(xpath = "//*[text()= 'Account']")
     public WebElement accountButton;

    @FindBy(xpath = "//*[@rel='nofollow']")
    public WebElement signinButton;

    @FindBy(id = "input_identifierValue")
    public WebElement emailAddress;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement firstContinueButton;

    @FindBy(name = "password")
    public WebElement passwordField;

   @FindBy(xpath = "//*[@aria-labelledby='confirm-password']")
   public WebElement confirmPasswordField;

    @FindBy(xpath = "//body/div[1]/div[4]/form[1]/div[1]/div[1]/div[5]/div[1]/button[1]/span[3]")
    public WebElement secondContinueButton;

    @FindBy(id = "input_first_name")
    WebElement firstNameField;

    @FindBy(id = "input_last_name")
    WebElement lastNameField;

    @FindBy(name = "phone[number]")
    WebElement phoneNumberField;

    public void fillRegistrationData(String firstname, String lastname , String phonenumber){
       firstNameField.sendKeys(firstname);
       lastNameField.sendKeys(lastname);
       phoneNumberField.sendKeys(phonenumber);
    }

    @FindBy(xpath = "//body/div[1]/div[4]/form[1]/div[1]/div[2]/div[5]/div[1]/button[1]/span[3]")
    public WebElement thirdContinueButton;

    @FindBy(id = "gender")
    WebElement chooseGender;

    @FindBy(xpath = "//*[@data-value= 'M']")
    WebElement clickGender;

    public void selectGender(){
        chooseGender.click();
        clickGender.click();
    }

    @FindBy(id = "input_birth_date")
    public WebElement selectBirthdate;

    @FindBy(id = "acceptTC")
    public WebElement acceptTC;

    @FindBy(xpath = "//body/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/div[3]/div[2]/button[1]/span[3]")
    public WebElement fourthContinueButton;

    @FindBy(xpath = "//header/section[1]/div[2]/div[1]/label[1]")
    WebElement clickAccount;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement clickLogout;

    public void logoutButton(){
        clickAccount.click();
        clickLogout.click();
    }

}
