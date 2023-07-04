package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class LoginStepDefinitions {
    private LoginPage loginPage = new LoginPage();
    @Given("the user opens the application")
    public void theUserOpensTheApplication(){
        loginPage.getDrivers().navigate().to("https://the-internet.herokuapp.com/login");

    }

}
