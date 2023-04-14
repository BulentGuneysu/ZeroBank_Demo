package com.zerobank.step_defs;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("User taps on sign in button")
    public void user_taps_on_sign_in_button() {
        loginPage.tapOnSignInButton();
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.enterUserNameAndPassword(username,password);
    }

    @When("User taps on sign in button to login")
    public void user_taps_on_sign_in_button_to_login() {
        loginPage.tapOnSignInButtonToLogin();
    }

    @When("User taps on back button")
    public void user_taps_on_back_button() {
        Driver.get().navigate().back();
    }

    @Then("Validate that username is visible on the board")
    public void validate_that_username_is_visible_on_the_board() {
        String expected = "username";
        String actual = loginPage.getUserNameTextOnLoginPage();
        Assert.assertEquals(expected,actual);
    }

    @Then("Verify that user is not logged in and error message appears")
    public void verifyThatUserIsNotLoggedInAndErrorMessageAppears() {
        String expected = "Login and/or password are wrong.";
        String actual= loginPage.getErrorMessageText();
        Assert.assertEquals(expected,actual);
    }
}