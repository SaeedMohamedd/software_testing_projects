package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TodoPage extends BasePage {

    public TodoPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css="[data-testid=\"welcome\"]")
    WebElement welcomemessage;

    @FindBy(css="[data-testid=\"add\"]")
    WebElement addtodobutton ;



    public void clickonplusbutton()
    {
        addtodobutton.click();
    }


    public boolean isWelcomeDisplay()
    {
        return  welcomemessage.isDisplayed();
    }


}
