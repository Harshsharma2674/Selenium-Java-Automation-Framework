package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    
    WebDriver driver;

    //constructor
    public ProductPage(WebDriver driver){
        this.driver=driver;
    }

    //Locator
    By firstProduct = By.xpath("//div[@class='product'])[1]");
    By addToCartBtn= By.id("add-to-Cart"); 

    //Actions
    public void selectFirstProduct(){
        driver.findElement(firstProduct).click();
    }

    public void clickAndToCart(){
        driver.findElement(addToCartBtn).click();
    }
}
