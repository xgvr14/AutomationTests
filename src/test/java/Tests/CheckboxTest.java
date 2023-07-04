package Tests;

import Pages.CheckBoxesPage;
import config.TestBase;
import org.apache.http.util.Asserts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckboxTest extends TestBase {
    private CheckBoxesPage checkboxesPage;

    @Test
    public void checkboxTest() {
        checkboxesPage = new CheckBoxesPage(driver);

        //1. Launch app
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");

        //2. Verify if checkbox1 is active/inactive
        boolean beginingValue1 = beginningCheck1();

        //3 Verify if checkbox 2 is active/inactive
        boolean beginningValue2 = beginningCheck2();

        //4. Click checkbox 1 and checkbox2
        checkboxesPage.getCheckbox1().click();
        checkboxesPage.getCheckbox2().click();

        //5. Check again checkbox 1 and checkbox 2
        boolean endValue1 = endCheck1();
        boolean endValue2 = endCheck2();

        //Expected: active state after clicking checkoutboxes should be different from what it was in the beggining
        Assertions.assertNotEquals(beginingValue1, endValue1);
        Assertions.assertNotEquals(beginningValue2, endValue2);

    }

    public boolean beginningCheck1() {

        if (checkboxesPage.getCheckbox1().isSelected()) {
            System.out.println("Checkbox 1 is selected");
            return true;
        } else {
            System.out.println("Checkbox 1 is not selected");
            return false;
        }

    }

    public boolean endCheck1() {


        if (checkboxesPage.getCheckbox1().isSelected()) {
            System.out.println("Checkbox 1 is selected");
            return true;
        } else {
            System.out.println("Checkbox 1 is not selected");
            return false;
        }
    }

    public boolean beginningCheck2() {


        if (checkboxesPage.getCheckbox2().isSelected()) {
            System.out.println("Checkbox 2 is selected");
            return true;
        } else {
            System.out.println("Checkbox 2 is not selected");
            return false;
        }
    }

    public boolean endCheck2() {


        if (checkboxesPage.getCheckbox2().isSelected()) {
            System.out.println("Checkbox 2 is selected");
            return true;
        } else {
            System.out.println("Checkbox 2 is not selected");
            return false;
        }
    }
}
