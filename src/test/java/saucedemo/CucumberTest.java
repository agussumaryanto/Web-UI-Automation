package saucedemo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @Deprecated
    @RunWith(Cucumber.class)
    @CucumberOptions(
            glue = {"saucedemo.stepdef"},
            features = {"src/test/resources"},
            tags = "@login",
            plugin = {"pretty", "html:reports/cucumber.html", "json:reports/cucumber.json"}
    )

    public class CucumberTest {

    }
