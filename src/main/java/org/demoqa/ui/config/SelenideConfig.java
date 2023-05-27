package org.demoqa.ui.config;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class SelenideConfig {
    private static Properties properties;
    static {
        try{
            String path = "src/main/resources/selenide.properties";
            FileInputStream input  = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);



            Configuration.timeout = Integer.parseInt(getProperty("selenide.timeout"));
            Configuration.browser = getProperty("selenide.browser");
            Configuration.screenshots = Boolean.parseBoolean(getProperty("selenide.screenshots"));
            Configuration.reportsFolder = getProperty("selenide.reportsFolder");
            Configuration.assertionMode = AssertionMode.valueOf(getProperty("selenide.assertionsMode"));
            Configuration.browserSize = getProperty("selenide.browserSize");

            System.setProperty("allure.attachments.screenshots", "true");
            System.setProperty("selenide.screenshots", "true");




        }  catch (IOException e) {
            throw new RuntimeException("File was not found");
        }
    }

    public static  String getProperty(String key){
        return  properties.getProperty(key).trim();
    }
}
