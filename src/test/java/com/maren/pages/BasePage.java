package com.maren.pages;

import com.maren.config.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    public static WebDriver driver = WebDriverFactory.getDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);
    }
    public static void openApp(){
        driver.get("https://www.saucedemo.com/");
    }

    public static void closeApp(){
        if(driver != null){
            driver.close();
        }
    }
}
