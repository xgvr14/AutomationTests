package Pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxesPage extends TestBase {

    @FindBy(xpath = "//div/div/div/form/input")
    private WebElement checkbox1;

    @FindBy(xpath = "//div/div/div/form/input[2]")
    private WebElement checkbox2;

    public CheckBoxesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public WebElement getCheckbox1() {
        return checkbox1;
    }

    public  WebElement getCheckbox2() {
        return checkbox2;
    }


}
