package com.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    public static WebDriver driver;

    public void doLogin(){
        LoginPage loginPage=new LoginPage(driver);
        
        String username=ConfigReader.getProperty("username");
        String password= ConfigReader.getProperty("password");

        loginPage.login(username, password);
    }

    @BeforeMethod
    public void setup() {
        String browser = ConfigReader.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));
        doLogin();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    
}
