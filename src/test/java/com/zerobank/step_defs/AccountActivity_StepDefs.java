package com.zerobank.step_defs;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivity_StepDefs {

    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Then("Validate that the account activity title is correct")
    public void validate_that_the_account_activity_title_is_correct() {
        String expected = "Zero - Account Activity";
        String actual = Driver.get().getTitle();
        Assert.assertEquals(expected,actual);
    }

    @Then("Validate that the default option is Savings")
    public void validateThatTheDefaultOptionIsSavings() {
        Select select = new Select(accountActivityPage.getDropDownMenu());

        String expected = "Savings";
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected,actual);
    }

    @Then("Validate that dropDown menu has followings")
    public void validate_that_dropDown_menu_has_followings(List<String> list) {
        Select select = new Select(accountActivityPage.getDropDownMenu());
        List<String> expected = list;
        List<String> actual = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(expected,actual);
    }

    @Then("Validate that the transaction subtitles contain the followings")
    public void validate_that_the_transaction_subtitles_contain_the_followings(List<String> list) {
        List<String> expected = list;
        List<String> actual = accountActivityPage.getTransactionSubTitleTexts();
        Assert.assertEquals(expected,actual);
    }

}