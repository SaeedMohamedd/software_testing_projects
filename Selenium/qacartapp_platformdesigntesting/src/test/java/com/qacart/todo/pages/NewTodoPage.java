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



    public void fillthenewtasktextfield(String newtasktext)
    {
        newtextfieldfornewtodo.sendKeys(newtasktext);
    }
    public void submitnewtask()
    {
        submimtnewtaskbutton.click();
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
