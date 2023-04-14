package com.zerobank.step_defs;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class PayBills_StepDefs {

    PayBillsPage payBillsPage = new PayBillsPage();

    @Then("Verify that Pay Bills title is correct")
    public void verify_that_Pay_Bills_title_is_correct() {
        String expected = "Zero - Pay Bills";
        String actual = Driver.get().getTitle();
        Assert.assertEquals(expected,actual);
    }

    @When("Fill out all necessary fields")
    public void fill_out_all_necessary_fields() {
        payBillsPage.fillOutFields();
    }

    @When("Tap on pay button")
    public void tap_on_pay_button() {
        payBillsPage.tapOnPayButton();
    }

    @Then("Verify that success message is appear")
    public void verify_that_success_message_is_appear() {
        String expected = "The payment was successfully submitted.";
        String actual = payBillsPage.getSuccessMessageText();
        Assert.assertEquals(expected,actual);
    }

    @When("User sends amount to input box")
    public void user_sends_amount_to_input_box() {
        payBillsPage.sendAmountIntoBox("100");
    }

    @Then("Validate that error message is visible on date box")
    public void validate_that_error_message_is_visible_on_date_box() {
        String expected = "Please fill out this field.";
        String actual = payBillsPage.getErrorMessageAmount();
        Assert.assertEquals(expected,actual);
    }

    @When("User sends date to input box")
    public void user_sends_date_to_input_box() {
        payBillsPage.sendDateIntoBox("2023-04-25");
    }

    @Then("Validate that error message is visible on amount box")
    public void validate_that_error_message_is_visible_on_amount_box() {
        String expected = "Please fill out this field.";
        String actual = payBillsPage.getErrorMessageDate();
        Assert.assertEquals(expected,actual);
    }

    @When("User sends invalid character to date box")
    public void user_sends_invalid_character_to_date_box() {
        payBillsPage.sendDateIntoBox("test");
    }

    @Then("Validate that date box is still empty")
    public void validate_that_date_box_is_still_empty() {
        Assert.assertTrue(payBillsPage.isDateBoxEmpty());
    }
}