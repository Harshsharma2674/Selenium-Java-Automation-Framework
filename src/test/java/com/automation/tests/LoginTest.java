package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.base.BaseTest;

public class LoginTest extends BaseTest{
    @Test
    public void loginTest(){
        LoginPage lp = new LoginPage(driver);

        lp.login(
            ConfigReader.getProperty("username"),
            ConfigReader.getProperty("password")
        );

        //validation
        Assert.assertTrue(driver.getCurrentUrl().contains("sauce"));
    }

    // @Test
    // public void testAddToCart(){
    //     doLogin();  // Reusable Login

    //     //Continue test
    // }
}

