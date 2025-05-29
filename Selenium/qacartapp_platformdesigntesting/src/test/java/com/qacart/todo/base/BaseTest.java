package com.qacart.todo.base;

import com.qacart.todo.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {


    protected WebDriver driver ;

    @BeforeTest
    public void setup(){
        driver = new DriverFactory().intializeDriver();
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
