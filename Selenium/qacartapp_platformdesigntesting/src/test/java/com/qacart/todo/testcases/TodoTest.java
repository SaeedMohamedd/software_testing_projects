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
        String newtodotext=
        loginpage
                .LoadURLPage()
                .login("saeed@tester.com","Tester@2025")
                .clickonplusbutton().fillthenewtasktextfield("Learn Selenium").submitnewtask().getnewtodotext();
        Assert.assertEquals(newtodotext,"Learn Selenium");
    }



    @Test(enabled = true)
    public void ShouldBeAbleToDeleteTodo(){
        LoginPage loginpage=new LoginPage(driver);
        String actualResult =
        loginpage
                .LoadURLPage()
                .login("saeed@tester.com","Tester@2025")
                .clickonplusbutton()
                .fillthenewtasktextfield("Learn Selenium")
                .submitnewtask()
                .deletetodotask()
                .getnotodotext();

        Assert.assertEquals(actualResult,"No Available Todos");
    }
}
