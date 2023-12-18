package com.maren.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath ="//*[@data-test='username']" )
    private WebElement user_field;

    @FindBy(xpath ="//*[@data-test='password']" )
    private WebElement password_field;

    @FindBy(xpath ="//*[@data-test='login-button']")
    private WebElement login_button;


    public void doLogin(String user){
        user_field.sendKeys(user);
        password_field.sendKeys("secret_sauce");
        login_button.click();
    }

}
