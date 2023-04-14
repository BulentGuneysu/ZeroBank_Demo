package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddNewPayeePage extends BasePage{

    @FindBy(css = "#np_new_payee_name")
    @CacheLookup
    private WebElement payeeName;

    @FindBy(css = "#np_new_payee_address")
    @CacheLookup
    private WebElement payeeAddress;

    @FindBy(css = "#np_new_payee_account")
    @CacheLookup
    private WebElement account;

    @FindBy(css = "#np_new_payee_details")
    @CacheLookup
    private WebElement payeeDetails;

    @FindBy(css = "#add_new_payee")
    @CacheLookup
    private WebElement addButton;

    @FindBy(css = "div#alert_content")
    @CacheLookup
    private WebElement successMessage;

    public WebElement getPayeeName(){
        return payeeName;
    }

    public WebElement getPayeeAddress() {
        return payeeAddress;
    }

    public WebElement getAccount() {
        return account;
    }

    public WebElement getPayeeDetails() {
        return payeeDetails;
    }

    public void tapOnAddButton(){
        BrowserUtils.clickWithJS(addButton);
    }
}
