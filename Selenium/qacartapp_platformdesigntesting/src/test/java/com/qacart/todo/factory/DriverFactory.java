package com.qacart.todo.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private WebDriver driver;
    public WebDriver intializeDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qacart-todo.herokuapp.com/");
        driver.manage().window().maximize();
        return driver ;
    }
}
