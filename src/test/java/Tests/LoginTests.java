package Tests;

import Pages.LoginPage;
import config.TestBase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.HttpChannelState;

public class LoginTests extends TestBase {
    private LoginPage loginPage;
    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);

        //1.Launch app
        driver.navigate().to("https://the-internet.herokuapp.com/login");

        //2.Enter a valid username
        loginPage.getUsernameField().sendKeys("tomsmith");

        //3.Enter a valid password
        loginPage.getPasswordField().sendKeys("SuperSecretPassword!");

        //4.Click on login button
        loginPage.getLoginButton().click();

        //Expected: the user is successfully logged in

        Assertions.assertEquals("You logged into a secure area!\n" +
                "×", loginPage.getMessage().getText());
    }
}