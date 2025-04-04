package com.thetestingacademy.tests.sampleTestCases;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium {

    @Description("Dry Run")
    @Test
    public void test_VWOLogin() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        Thread.sleep(3000);
        driver.quit();
    }
}
