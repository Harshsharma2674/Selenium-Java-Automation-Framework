package com.automation.utils;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name ="productData")
    public Object[][] getData(){
        return  new  Object[][]{
            {"laptop"},{"Phone"},{"Headphones"}
        };
    }
}