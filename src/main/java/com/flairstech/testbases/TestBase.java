package com.flairstech.testbases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver = null;

    public static String browser = "chrome"; // or "firefox", "edge", etc.
    public static String URL =  "https://www.jumia.com.eg/";


    public static void configureBrowser(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


public static void  initBrowser(){
        switch (browser) {
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                configureBrowser();
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                configureBrowser();
            }
            case "edge" -> {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                configureBrowser();
            }
            default -> throw new IllegalArgumentException("Invalid browser: " + browser);
        }
}

}
