package com.automation.tests;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.automation.base.BaseTest;
import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.utils.TestData;

public class AddToCartTest extends BaseTest{

    @Test(dataProvider="productData", dataProviderClass= TestData.class)
    public void testAddToCart(){

        //step 1: Login (from BaseTest)
        doLogin();

        //Step 1.1: Verify Login Success (Very Important)
        Assert.assertTrue(driver.getCurrentUrl().contains("home"),"Login failed");

        //Step 2: Search Product
        HomePage homePage=new HomePage(driver);
        homePage.searchProduct("Laptop");

        //Step 3: Select and Add Product
        ProductPage productPage= new ProductPage(driver);
        productPage.selectFirstProduct();
        productPage.clickAndToCart();

        //Step 4: Validate Cart
        CartPage cartPage=new CartPage();
        String count= cartPage.getCartCount();

        Assert.assertEquals(count,"1","Product not added to cart!");

    }
}
