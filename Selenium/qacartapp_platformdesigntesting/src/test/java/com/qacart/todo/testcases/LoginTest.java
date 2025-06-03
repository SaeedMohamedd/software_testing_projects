package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.TodoPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void ShouldBeLoginWithEmailAndPassword(){
        LoginPage loginobj = new LoginPage(driver);
        loginobj.LoadURLPage();
        TodoPage todopage=loginobj.login("saeed@tester.com","Tester@2025");
        Assert.assertTrue(todopage.isWelcomeDisplay());
    }
}
