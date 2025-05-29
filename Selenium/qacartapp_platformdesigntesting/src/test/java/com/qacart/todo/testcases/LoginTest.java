package com.qacart.todo.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    @Test
    public void ShouldBeLoginWithEmailAndPassword(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qacart-todo.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("saeed@tester.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Tester@2025");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();
        boolean isWelcomeDisplayed = driver.findElement(By.cssSelector("[data-testid=\"welcome\"]")).isDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);
        driver.quit();
    }
}
