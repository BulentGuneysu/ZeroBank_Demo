package com.zerobank.step_defs;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.text.ParseException;
import java.util.List;

public class FindTransactions_StepDefs {

    AccountActivityPage accountActivityPage = new AccountActivityPage();
    FindTransactionsPage findTransactionsPage = new FindTransactionsPage();

    @When("Tap on Find Transactions")
    public void tap_on_Find_Transactions() {
        accountActivityPage.tapOnFindTransactionButton();
    }

    @When("Send {string} keyword into description input box")
    public void send_keyword_into_description_input_box(String string) {
        BrowserUtils.sendKeys(findTransactionsPage.getDescriptionInputBox(), string);
    }

    @When("Tap on find button")
    public void tap_on_find_button() {
        findTransactionsPage.tapOnFindButton();
    }

    @Then("Verify that all description results contains {string}")
    public void verify_that_all_description_results_contains(String string) {
        List<String> listOfTexts = findTransactionsPage.getAllTextsFromDescriptions();

        /*boolean bool = true;
        for (String listOfText : listOfTexts) {
            if(!listOfText.contains(string)){
                bool = false;
                break;
            }
        }
        Assert.assertTrue(bool);*/
        //second way
        boolean b = listOfTexts.stream().allMatch(n -> n.contains(string));
        Assert.assertTrue(b);
    }

    @When("User enters date range from {string} to {string}")
    public void user_enters_date_range_from_to(String fromDate, String toDate) {
    findTransactionsPage.fillDateBoxes(fromDate,toDate);
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String fromDate, String toDate) throws ParseException {
    findTransactionsPage.verifyDatesOfRange(fromDate,toDate);
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() throws ParseException {
           Assert.assertTrue(findTransactionsPage.isDateSorted());

    }

}