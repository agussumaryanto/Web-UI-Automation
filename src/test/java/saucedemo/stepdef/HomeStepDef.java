package saucedemo.stepdef;

import io.cucumber.java.en.Then;
import saucedemo.BaseTest;
import saucedemo.page.HomePage;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("the user is redirected to the homepage")
    public void theUserIsRedirectedToTheHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomepage();
    }
}
