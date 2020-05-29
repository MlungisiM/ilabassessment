package com.ilabquality.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    private static RemoteWebDriver driver;
    @FindBy(xpath = "(//a[text()='CAREERS'])[1]")
    private
    WebElement careersLink;

    public LandingPage(RemoteWebDriver driver) {
        PageFactory.initElements(driver, this);
        LandingPage.driver = driver;
    }

    public CareersPage clickCareersLink() {
        careersLink.click();
        return new CareersPage(driver);
    }
}
