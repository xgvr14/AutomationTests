package Tests;

import config.TestBase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.HttpChannelState;

public class LoginTests extends TestBase {
    @Test
    public void loginTest(){
        //1.Launch app
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        //2.Enter a valid username
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith");

        //3.Enter a valid password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");
        //4.Click on login button
        WebElement loginButton = driver.findElement(By.className("radius"));
        loginButton.click();
        //Expected: the user is successfully logged in
        WebElement message = driver.findElement(By.id("flash"));
        Assertions.assertEquals("You logged into a secure area!\n" +
                "×",message.getText());
    }
}