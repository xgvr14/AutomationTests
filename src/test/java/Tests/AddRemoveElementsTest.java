package Tests;

import Pages.AddRemoveElementsPage;
import config.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class AddRemoveElementsTest extends TestBase {

private AddRemoveElementsPage addRemoveElementsPage;
    @Test

    public void addRemoveElement() {
         addRemoveElementsPage = new AddRemoveElementsPage(driver);

        //1.  Launch app
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

        //2.  Click Add Element .
        addRemoveElementsPage.getButtonAdd().click();

        //3.  Click Delete button n times.
        addRemoveElementsPage.getDeleteButton().click();

        // Expected: Delete button no longer displayed

        Assertions.assertEquals(addRemoveElementsPage.getDeleteButton().isDisplayed(),true);
    }






}

