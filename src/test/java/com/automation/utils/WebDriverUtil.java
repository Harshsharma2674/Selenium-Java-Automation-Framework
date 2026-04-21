package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtil {
    WebDriver driver;

    public WebDriverUtil(WebDriver driver){
        this.driver=driver;
    }

    public void sendKeys(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }

    public void click(WebElement element){
        element.click();
    } 
}
