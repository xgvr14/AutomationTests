package Tests;

import config.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HoverTests extends TestBase {
    @Test
    public void HoverTest() {
        // 1. open app
        driver.navigate().to("https://the-internet.herokuapp.com/hovers");
        // 2. mouse hover first image
        WebElement avatarImage = driver.findElement(By.xpath("//div[2]/div/div/div/img"));
        Actions action = new Actions(driver);
        action.moveToElement(avatarImage).build().perform();
        //3. Expected: correct name is shown under the image
        WebElement text = driver.findElement(By.xpath("//div[2]/div/div/div/div/h5"));
        Assertions.assertEquals("name: user1", text.getText());
        //4. Click "view profile"
        WebElement buttonViewProfile = driver.findElement(By.xpath("//div[2]/div/div/div/div/a"));
        // wait.until(ExpectedConditions.elementToBeClickable(buttonViewProfile));
        buttonViewProfile.click();
        //5.Expected: Not Found message
        WebElement text1 = driver.findElement(By.xpath("//h1"));
        Assertions.assertEquals("Not Found", text1.getText());
    }
}
