package saucedemo.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import saucedemo.BaseTest;
import saucedemo.page.LoginPage;

public class LoginStepDef extends BaseTest {

    LoginPage loginPage;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @And("the user inputs the username {string}")
    public void theUserInputsTheUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("the user inputs the password {string}")
    public void theUserInputsThePassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("the user clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("the user sees the error message {string}")
    public void theUserSeesTheErrorMessage(String errorMessage) {
        loginPage.validateErrorAppear(errorMessage);
    }
}
