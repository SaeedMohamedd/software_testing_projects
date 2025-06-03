package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTodoPage extends BasePage {

    public NewTodoPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css= "[data-testid=\"new-todo\"]")
    WebElement newtextfieldfornewtodo;

    @FindBy(css= "[data-testid=\"submit-newTask\"]")
    WebElement submimtnewtaskbutton;

    @FindBy(css ="[data-testid=\"todo-item\"]" )
    WebElement newtodoitem;

    @FindBy(css="[data-testid=\"delete\"]")
      WebElement deletetodotaskbutton;

    @FindBy(css="[data-testid=\"no-todos\"]")
      WebElement notodotext;



    public NewTodoPage fillthenewtasktextfield(String newtasktext)
    {
        newtextfieldfornewtodo.sendKeys(newtasktext);
        return this;
    }
    public NewTodoPage submitnewtask()
    {
        submimtnewtaskbutton.click();
        return this ;
    }

    public String getnewtodotext()
    {
        return newtodoitem.getText();
    }
    public NewTodoPage deletetodotask()
    {
        deletetodotaskbutton.click();
        return this;
    }
    public String getnotodotext()
    {
        return notodotext.getText();
    }
}
