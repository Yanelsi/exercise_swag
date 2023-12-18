package com.maren.config;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/com/maren/config/chromedriver.exe");
        System.setProperty("browserWidth", "1280");
        System.setProperty("device", "chrome");
        Map<String, Object> chromePrefs = new HashMap<String, Object>();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs",chromePrefs);
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }

}
