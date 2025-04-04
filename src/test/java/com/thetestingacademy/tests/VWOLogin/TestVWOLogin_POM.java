package com.thetestingacademy.tests.VWOLogin;

import com.thetestingacademy.pages.pageObjectModel.LoginPage_POM;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWOLogin_POM {

    @Owner("PriyaAyyanar")
    @Description("Verify that invalid credentials give error msg")
    @Test
    public void testVWO_Login_negative(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://app.vwo.com");
        LoginPage_POM loginPagePOM = new LoginPage_POM(driver);

        String error_msg = loginPagePOM.loginToVWO_InvalidCrdns("user@gmail.com","pwd");

        assertThat(error_msg).isNotEmpty().isNotNull().isNotBlank();
        Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");

    }
}
