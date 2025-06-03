package com.qacart.todo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;


    public  BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public void LoadURLPage()
    {
        driver.get("https://qacart-todo.herokuapp.com/");
    }
}
