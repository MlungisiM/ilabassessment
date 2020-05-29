package com.ilabquality.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("ALL")
public class CareersPage {

    private static RemoteWebDriver driver;
    @FindBy(linkText = "South Africa")
    private
    WebElement countryLink;

    public CareersPage(RemoteWebDriver driver) {
        PageFactory.initElements(driver, this);
        CareersPage.driver = driver;
    }

    public JobsListingPage clickSouthAfricaCountryLink() {
        countryLink.click();
        return new JobsListingPage(driver);
    }
}
