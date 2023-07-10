package com.flairtech.pages;

import com.flairstech.testbases.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class AddtoCartPage {
    WebDriver driver;

    public AddtoCartPage (WebDriver driver) {
        this.driver= driver  ;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[@id='jm']/main[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement superMarket;
    public void hoverMarket(){
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(superMarket).perform();
    }

    @FindBy(xpath = "//a[contains(text(),'Bakery')]")
    public WebElement bakeryTab;

    // @FindBy(xpath = "//h3[contains(text(),'TODO Brownies Cake - Pack of 8')]")
    // ToDO is not available at supermarket
//Molto Magnum Chocolate Stuffed Croissant – 24 Pcs
    @FindBy(xpath = " //h3[contains(text(),'Molto Magnum Chocolate Stuffed Croissant – 24 Pcs')]")
    WebElement firstItem;

    @FindBy(xpath = "//*[@id=\"add-to-cart\"]/button")
    WebElement addtoCartButton;

    public void firstItemtoCart() throws InterruptedException {
        firstItem.click();
        addtoCartButton.click();
        Thread.sleep(3000);
        driver.navigate().back();
    }
    @FindBy(xpath = "//h3[contains(text(),'Brownies - 350 G')]")
    WebElement secondItem;

    public void secondItemtoCart() throws InterruptedException {
        secondItem.click();
        addtoCartButton.click();
        Thread.sleep(3000);
    }

    @FindBy (xpath = "/html/body/div[1]/header/section/div[2]/a")
    public WebElement cartButton;


     @FindBy(xpath = "//h3[contains(text(),'Molto Magnum Chocolate Stuffed Croissant – 24 Pcs')]")
     WebElement firstSelectedItem;

//    @FindBy(xpath = "//h3[contains(text(),'TODO Brownies Cake - Pack of 8')]")
//    WebElement firstSelectedItem;

    @FindBy (xpath = "//h3[contains(text(),'Brownies - 350 G')]")
    WebElement secondSelectedItem;
    public void itemsAssertion(){
        SoftAssert soft = new SoftAssert();

        String actualFirstItemName = firstSelectedItem.getText();
       // String expectedFirstItemName = "TODO Brownies Cake - Pack of 8";
        String expectedFirstItemName = "Molto Magnum Chocolate Stuffed Croissant – 24 Pcs";
        soft.assertEquals(actualFirstItemName,expectedFirstItemName,"Molto Magnum not exists");
       // soft.assertEquals(actualFirstItemName,expectedFirstItemName,"TODO not exists");
        //soft.assertTrue(actualFirstItemName.contains(expectedFirstItemName),"TODO not exists");

        String actualSecondItemName = secondSelectedItem.getText();
        String expectedSecondItemName = "Lino Oat Brownies - 350 G";
        soft.assertEquals(actualSecondItemName,expectedSecondItemName,"Lino not exists");
        //soft.assertTrue(actualSecondItemName.contains(expectedSecondItemName),"Lino not exists");

        soft.assertAll();
    }

    @FindBy(xpath = "//*[@id=\"jm\"]/main/div/div[2]/div/article/div[1]/p[2]")
    WebElement actualItemsCost;
    public void priceAssertion(){
        SoftAssert soft = new SoftAssert();

        String actualCost = actualItemsCost.getText();
        String expectedCost = "EGP 279.00";
        //String expectedCost = "EGP 105.95";
        soft.assertEquals(actualCost,expectedCost,"Actual cost not equals expected cost");

        soft.assertAll();
    }

}
