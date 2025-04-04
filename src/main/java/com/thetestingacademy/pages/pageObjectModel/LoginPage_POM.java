package com.thetestingacademy.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage_POM {

    WebDriver driver;
    //Encapsulation as it contains login credentials
    // Default Constructor
    public LoginPage_POM(WebDriver driver){
        this.driver = driver;
    }

    // Page Locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By sign_in_btn = By.id("js-login-btn");
    private  By error_msg = By.id("js-notification-box-msg");


    // Page Actions
    public String loginToVWO_InvalidCrdns(String user, String pwd){
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(sign_in_btn).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(error_msg));

        String err_msg_txt = driver.findElement(error_msg).getText();
        return err_msg_txt;
    }

    public void loginToVWO_ValidCrdns(String user, String pwd){
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(sign_in_btn).click();

    }
}
