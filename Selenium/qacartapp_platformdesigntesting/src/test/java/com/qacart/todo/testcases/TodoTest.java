package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewTodoPage;
import com.qacart.todo.pages.TodoPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TodoTest extends BaseTest {

    @Test
    public void ShouldBeAbleToAddNewTodo(){

        LoginPage loginpage=new LoginPage(driver);
        loginpage.LoadURLPage();
        loginpage.login("saeed@tester.com","Tester@2025");

        TodoPage todopage =new TodoPage(driver);
        todopage.isWelcomeDisplay();
        todopage.clickonplusbutton();

        NewTodoPage newtodopage = new NewTodoPage(driver);

        newtodopage.fillthenewtasktextfield("Learn Selenium");
        newtodopage.submitnewtask();
        Assert.assertEquals(newtodopage.getnewtodotext(),"Learn Selenium");
    }



    @Test
    public void ShouldBeAbleToDeleteTodo(){
        LoginPage loginpage=new LoginPage(driver);
        loginpage.LoadURLPage();
        loginpage.login("saeed@tester.com","Tester@2025");

        TodoPage todopage =new TodoPage(driver);
        todopage.isWelcomeDisplay();
        todopage.clickonplusbutton();


        NewTodoPage newtodopage = new NewTodoPage(driver);

        newtodopage.fillthenewtasktextfield("Learn Selenium");
        newtodopage.submitnewtask();

        newtodopage.deletetodotask();
        String actualResult = newtodopage.getnotodotext();
        Assert.assertEquals(actualResult,"No Available Todos");
    }
}
