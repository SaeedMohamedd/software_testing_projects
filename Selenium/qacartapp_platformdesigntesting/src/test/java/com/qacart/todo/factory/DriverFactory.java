package com.qacart.todo.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverFactory {
    private WebDriver driver ;
    public WebDriver intializeDriver(){

        String browser = System.getProperty("browser","CHROME");
        switch (browser){
            case "CHROME":
                ChromeOptions options = new ChromeOptions();
                 driver = new ChromeDriver(options);
               //   WebDriverManager.chromedriver().setup();
               //  driver = new ChromeDriver();
                break;
            case "SAFARI":
                driver= new SafariDriver();
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "CHROMIUM":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromiumoptions = new ChromeOptions();
                chromiumoptions.setBinary("/snap/bin/chromium");
                driver= new ChromeDriver(chromiumoptions);

            default:
                throw new RuntimeException("The browser is not supported");

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver ;
    }
}
