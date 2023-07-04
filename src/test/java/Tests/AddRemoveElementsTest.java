package Tests;

import Pages.AddRemoveElementsPage;
import config.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Scanner;

public class AddRemoveElementsTest extends TestBase {

    private AddRemoveElementsPage addRemoveElementsPage;

    @Test

    public void addRemoveElement() {
        addRemoveElementsPage = new AddRemoveElementsPage(driver);

        //1.  Launch app
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

        //2. Verify 'Add Element button is displayed
        Assertions.assertTrue(addRemoveElementsPage.getButtonAdd().isDisplayed(), "Add Button element is not displayed");

        //3.  Click Add Element .
        addRemoveElementsPage.getButtonAdd().click();

        //4.Verify that a new element is added dynamically.
        Assertions.assertTrue(addRemoveElementsPage.getAddedElement().isDisplayed(), "Added element is not displayed");

        //5. Verify that the newly added element has a "Delete" button associated with it
        Assertions.assertTrue(addRemoveElementsPage.getDeleteButton().isDisplayed(), "Delete button is not displayed for the added element");

        //6.  Click "Delete" button .
        addRemoveElementsPage.getDeleteButton().click();

        //7. Verify that the element is removed from the page
        Assertions.assertFalse(addRemoveElementsPage.getAddedElement().isDisplayed(), "Added element is still displayed");

        //8. Repeat steps 3  times to add and remove multiple elements
              performMultipleTimes();

              //9. Verify that after removing all elements, the "Delete" button is no longer displayed
               Assertions.assertFalse(addRemoveElementsPage.getDeleteButton().isDisplayed(), "Delete button is still displayed");
    }
    public void performMultipleTimes(){
        for (int i = 0; i < 3; i++) {
            addRemoveElementsPage.getButtonAdd().click();
            Assertions.assertTrue(addRemoveElementsPage.getAddedElement().isDisplayed(), "Added element is not displayed");
            addRemoveElementsPage.getDeleteButton().click();
            Assertions.assertFalse(addRemoveElementsPage.getAddedElement().isDisplayed(), "Added element is still displayed");
        }}



}

