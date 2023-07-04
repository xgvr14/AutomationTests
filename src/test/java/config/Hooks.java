package config;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup() {
        TestBase.createDriver();
    }

    @After
    public void tearDown() {
        TestBase.destroyDriver();
    }
}
