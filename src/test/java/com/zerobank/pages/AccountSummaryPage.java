package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage{

    @FindBy(xpath = "//h2[@class='board-header']")
    @CacheLookup
    private List<WebElement> accountTypes;

    @FindBy(xpath = "//div[@class='board'][3]//th")
    @CacheLookup
    private List<WebElement> creditAccountColumnTitles;

    public List<String> getAccountTypesTextAsListOfString(){
        return BrowserUtils.getElementsText(accountTypes);
    }

    public List<String> getCreditAccountColumnTitles(){
        return BrowserUtils.getElementsText(creditAccountColumnTitles);
    }
}