package Pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(className = "radius")
    private WebElement loginButton;

    @FindBy(id = "flash")
    private WebElement message;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    public WebElement getUsernameField(){
        return usernameField;
    }
    public WebElement getPasswordField(){
        return passwordField;
    }
    public WebElement getLoginButton(){
        return loginButton;
    }
    public WebElement getMessage(){
        return message;
    }
}
