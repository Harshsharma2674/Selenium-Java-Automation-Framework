package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public void CartPage(WebDriver driver){
        this.driver=driver;
    }

    //locators
    By cartCount= By.id("cart-count");

    public String getCartCount(){
        return driver.findElement(cartCount).getText();
    }

}
