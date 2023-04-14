package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{

    @FindBy(css = "#sp_amount")
    @CacheLookup
    private WebElement amountInputBox;

    @FindBy(css = "#sp_date")
    @CacheLookup
    private WebElement dateInputBox;

    @FindBy(css = "#pay_saved_payees")
    @CacheLookup
    private WebElement payButton;

    @FindBy(xpath = "//span[text()='The payment was successfully submitted.']")
    @CacheLookup
    private WebElement successMessage;

    @FindBy(css = "div#alert_content")
    @CacheLookup
    private WebElement successMessageForAddNewPayee;

    public void fillOutFields(){
        BrowserUtils.sendKeys(amountInputBox, "50");
        BrowserUtils.sendKeys(dateInputBox, "2023-04-25");
    }

    public void tapOnPayButton(){
        BrowserUtils.clickWithJS(payButton);
    }

    public String getSuccessMessageText(){
        return successMessage.getText();
    }

    public void sendAmountIntoBox(String str){
        BrowserUtils.sendKeys(amountInputBox,str);
    }

    public String getErrorMessageAmount(){
        return dateInputBox.getAttribute("validationMessage");
    }

    public void sendDateIntoBox(String str){
        BrowserUtils.sendKeys(dateInputBox,str);
    }

    public String getErrorMessageDate(){
        return amountInputBox.getAttribute("validationMessage");
    }

    public boolean isDateBoxEmpty(){
        return dateInputBox.getAttribute("value").isEmpty();
    }

    public void tapOnPayBillsSubTitle(String str){
        WebElement element = Driver.get().findElement(By.xpath("//a[text()='" + str + "']"));
        BrowserUtils.clickWithJS(element);
    }

    public String getSuccessMessageForAddNewPayee(){
        return successMessageForAddNewPayee.getText();
    }

}