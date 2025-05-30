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

    @FindBy(css= "[data-testid=\"new-todo\"]")
            WebElement newtextfieldfornewtodo;

    @FindBy(css= "[data-testid=\"submit-newTask\"]")
            WebElement submimtnewtaskbutton;

    @FindBy(css ="[data-testid=\"todo-item\"]" )
    WebElement newtodoitem;

    @FindBy(css="[data-testid=\"delete\"]")
            private  WebElement deletetodotaskbutton;

    @FindBy(css="[data-testid=\"no-todos\"]")
            private  WebElement notodotext;


    public void clickonplusbutton()
    {
        addtodobutton.click();
    }
    public void fillthenewtasktextfield(String newtasktext)
    {
        newtextfieldfornewtodo.sendKeys(newtasktext);
    }
    public void submitnewtask()
    {
        submimtnewtaskbutton.click();
    }

    public boolean isWelcomeDisplay()
    {
        return  welcomemessage.isDisplayed();
    }

    public String getnewtodotext()
    {
        return newtodoitem.getText();
    }
    public void deletetodotask()
    {
        deletetodotaskbutton.click();
    }
    public String getnotodotext()
    {
        return notodotext.getText();
    }

}
