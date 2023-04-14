package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FindTransactionsPage extends BasePage{

    @FindBy(css = "#aa_description")
    @CacheLookup
    private WebElement descriptionInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    private WebElement findButton;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tbody/tr/td[2]")
    @CacheLookup
    private List<WebElement> descriptions;

    public WebElement getDescriptionInputBox(){
        return descriptionInputBox;
    }

    public void tapOnFindButton(){
        BrowserUtils.clickWithJS(findButton);
    }

    //First Way
    public List<String> getAllTextsFromDescriptions(){
        return BrowserUtils.getElementsText(descriptions);
    }
}