package Pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage extends TestBase {
    @FindBy (xpath = "//button[text()='Add Element']")
    private WebElement buttonAdd;

    @FindBy (xpath = "//*[@id='elements']/button")
    private WebElement deleteButton;

    @FindBy(xpath = "//div[@id='elements']/button[last()]")
    private WebElement addedElement;
    public AddRemoveElementsPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getButtonAdd(){
        return buttonAdd;
    }
    public WebElement getDeleteButton(){
        return deleteButton;
    }
    public WebElement getAddedElement(){
        return addedElement;
    }
}
