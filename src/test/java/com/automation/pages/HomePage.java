package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    //constructor
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    //Locator   (example:search bar)
    By searchBox=By.id("search");

    //Actions
    public void searchProduct(String productName){
        driver.findElement(searchBox).sendKeys(productName);
    }
}
