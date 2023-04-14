package com.zerobank.step_defs;

import com.zerobank.pages.AddNewPayeePage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.Map;

public class AddNewPayee_StepDefs {

    PayBillsPage payBillsPage = new PayBillsPage();
    AddNewPayeePage addNewPayeePage = new AddNewPayeePage();

    @When("User taps on {string} pay bill subtitle")
    public void user_taps_on_pay_bill_subtitle(String string) {
        payBillsPage.tapOnPayBillsSubTitle(string);
    }

    @When("Creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> map) {
        BrowserUtils.sendKeys(addNewPayeePage.getPayeeName(), map.get("Payee Name"));
        BrowserUtils.sendKeys(addNewPayeePage.getPayeeAddress(), map.get("Payee Address"));
        BrowserUtils.sendKeys(addNewPayeePage.getAccount(), map.get("Account"));
        BrowserUtils.sendKeys(addNewPayeePage.getPayeeDetails(), map.get("Payee details"));
    }

    @When("Taps on add button")
    public void taps_on_add_button() {
        addNewPayeePage.tapOnAddButton();
    }

    @Then("message The new payee The Law Offices of Hyde, Price & Scharks was should successfully created. should be displayed")
    public void message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_should_successfully_created_should_be_displayed() {
        String expected = "The new payee The Law Offices of Hyde, Price & Scharks was successfully created.";
        String actual = payBillsPage.getSuccessMessageForAddNewPayee();
        Assert.assertEquals(expected,actual);
    }
}