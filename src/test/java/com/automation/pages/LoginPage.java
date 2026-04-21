package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.automation.utils.WebDriverUtil;

public class LoginPage {

    WebDriver driver;
    WebDriverUtil util;


    public LoginPage(WebDriver driver){
        this.driver=driver;
        util=new WebDriverUtil(driver);
    }
    
    //Locators
    By usernameField = By.id("user-name");
    By passwordField= By.id("password"); 
    By loginBtn= By.id("login-button");

    //Actions
    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    } 

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }
    
    public void login(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
