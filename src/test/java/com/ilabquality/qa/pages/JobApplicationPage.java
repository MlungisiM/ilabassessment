package com.ilabquality.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobApplicationPage {

    @SuppressWarnings("unused")
    @FindBy(xpath = "//a[contains(text(),'Apply Online')]")
    private
    WebElement applyOnlineButton;
    @SuppressWarnings("unused")
    @FindBy(id = "applicant_name")
    private
    WebElement applicantNameTextbox;
    @SuppressWarnings("unused")
    @FindBy(id = "email")
    private
    WebElement emailTextbox;
    @SuppressWarnings("unused")
    @FindBy(id = "phone")
    private
    WebElement phoneTextbox;
    @SuppressWarnings("unused")
    @FindBy(id = "wpjb_submit")
    private
    WebElement sendApplicationButton;
    @SuppressWarnings("unused")
    @FindBy(xpath = "//div[@class='wpjb-field']//li[1]")
    private
    WebElement uploadFileErrorMessage;

    public JobApplicationPage(RemoteWebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterApplicantName(String name) {
        applicantNameTextbox.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailTextbox.sendKeys(email);
    }

    public void enterPhoneNumber(String phone) {
        phoneTextbox.sendKeys(phone);
    }

    public void clickSubmitApplicationButton() {
        sendApplicationButton.click();
    }

    public String getUploadErrorMessage() {
        return uploadFileErrorMessage.getText();
    }

    public void clickApplyOnlineButton() {
        applyOnlineButton.click();
    }
}
