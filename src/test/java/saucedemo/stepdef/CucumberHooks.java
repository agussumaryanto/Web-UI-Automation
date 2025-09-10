package saucedemo.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import saucedemo.BaseTest;

public class CucumberHooks extends BaseTest {

    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterTest() {
        //driver.close();
        if (driver != null) {
            try {
                Thread.sleep(500); // give Chrome time to close gracefully
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            driver.quit();
        }
    }
}
