package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
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

        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("saeed@tester.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Tester@2025");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"add\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"new-todo\"]")).sendKeys("Learn Selenium");
        driver.findElement(By.cssSelector("[data-testid=\"submit-newTask\"]")).click();
        String actualResult = driver.findElement(By.cssSelector("[data-testid=\"todo-item\"]")).getText();
        Assert.assertEquals(actualResult,"Learn Selenium");
    }



    @Test
    public void ShouldBeAbleToDeleteTodo(){
        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("saeed@tester.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Tester@2025");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"add\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"new-todo\"]")).sendKeys("Learn Selenium");
        driver.findElement(By.cssSelector("[data-testid=\"submit-newTask\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"delete\"]")).click();
        String actualResult = driver.findElement(By.cssSelector("[data-testid=\"no-todos\"]")).getText();
        Assert.assertEquals(actualResult,"No Available Todos");
    }
}
