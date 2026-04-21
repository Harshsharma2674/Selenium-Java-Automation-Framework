package com.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader{

    private static Properties prop;

    // Load file only once (IMPORTANT)
    static {
        try {
            FileInputStream fis = new FileInputStream(
                    System.getProperty("user.dir") + "/src/test/resources/config.properties"
            );
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get values
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

}
