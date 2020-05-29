package com.ilabquality.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class JobsListingPage {

    private static RemoteWebDriver driver;
    @FindBy(xpath = "//span[@class='wpjb-line-major']/a")
    private
    List<WebElement> jobLinks;

    public JobsListingPage(RemoteWebDriver driver) {
        PageFactory.initElements(driver, this);
        JobsListingPage.driver = driver;
    }

    public JobApplicationPage clickFirstJobLink() {
        jobLinks.get(0).click();
        return new JobApplicationPage(driver);
    }
}
