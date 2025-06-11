package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.utils.ConfigUtils;
import com.qacart.todo.utils.PropertiesUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;


public class LoginPage extends BasePage {


  public LoginPage(WebDriver driver){
        super(driver);
  }

    @FindBy(css="[data-testid=\"email\"]")
    WebElement emailInput;

    @FindBy(css="[data-testid=\"password\"]")
    WebElement passwordInput;

    @FindBy(css = "[data-testid=\"submit\"]")
    WebElement submit;

     public TodoPage login(String email, String password)
     {
         emailInput.sendKeys(email);
         passwordInput.sendKeys(password);
         submit.click();
       return  new TodoPage(driver);

     }
    public  LoginPage LoadURLPage()
    {
        driver.get(ConfigUtils.getInstance().getUrl());
        return  this;
    }

}
