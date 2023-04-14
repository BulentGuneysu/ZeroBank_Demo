package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(css = "#aa_accountId")
    @CacheLookup
    private WebElement dropDownMenu;

    @FindBy(css = "#all_transactions_for_account th")
    @CacheLookup
    private List<WebElement> transactionSubTitles;

    @FindBy(xpath = "//a[.='Find Transactions']")
    @CacheLookup
    private WebElement findTransactionsButton;

    public WebElement getDropDownMenu(){
        return dropDownMenu;
    }

    public List<String> getTransactionSubTitleTexts(){
        return BrowserUtils.getElementsText(transactionSubTitles);
    }

    public void tapOnFindTransactionButton(){
        BrowserUtils.clickWithJS(findTransactionsButton);
    }
}