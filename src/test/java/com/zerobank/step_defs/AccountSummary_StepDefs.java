package com.zerobank.step_defs;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

public class AccountSummary_StepDefs {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @When("User taps on {string} tab")
    public void user_taps_on_tab(String string) {
        accountSummaryPage.tapOnTab(string);
    }

    @When("User taps on {string} section")
    public void user_taps_on_section(String string) {
        accountSummaryPage.tapOnSection(string);
    }

    @Then("Validate that title is correct")
    public void validateThatTitleIsCorrect() {
        String expected = "Zero - Account Summary";
        String actual = Driver.get().getTitle();
        Assert.assertEquals(expected,actual);
    }

    @Then("Validate account types")
    public void validate_account_types(List<String> list) {
        List<String> expected = list;
        List<String> actual = accountSummaryPage.getAccountTypesTextAsListOfString();
        Assert.assertEquals(expected,actual);
    }

    @Then("Validate credit account columns")
    public void validate_credit_account_columns(List<String> list) {
        List<String> expected = list;
        List<String> actual = accountSummaryPage.getCreditAccountColumnTitles();
        Assert.assertEquals(expected,actual);
    }
}