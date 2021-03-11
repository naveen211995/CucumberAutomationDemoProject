package com.qa.example.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase(){

        try{
            prop = new Properties();
            FileInputStream fs = new FileInputStream("F:\\KundanSirProject\\TescoDemo\\src\\test\\java\\com\\qa\\example\\config\\config.properties");
            prop.load(fs);
        }catch (IOException e){
            e.getMessage();
        }

    }

    public static void initialization(){
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Selenium_Drivers\\geckodriver-v0.27.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("Incompatible Browser...");
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

    }

    public static void tearDown(){
        driver.quit();
    }

}
