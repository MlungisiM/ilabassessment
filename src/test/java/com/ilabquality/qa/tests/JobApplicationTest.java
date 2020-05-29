package com.ilabquality.qa.tests;

import com.ilabquality.qa.common.Base;
import com.ilabquality.qa.common.DataObjectProvider;
import com.ilabquality.qa.pages.CareersPage;
import com.ilabquality.qa.pages.JobApplicationPage;
import com.ilabquality.qa.pages.JobsListingPage;
import com.ilabquality.qa.pages.LandingPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobApplicationTest extends Base {

    private JobApplicationPage jobApplicationPage;

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        LandingPage landingPage = new LandingPage(getDriver());
        CareersPage careersPage = landingPage.clickCareersLink();
        JobsListingPage jobsListingPage = careersPage.clickSouthAfricaCountryLink();
        jobApplicationPage = jobsListingPage.clickFirstJobLink();
    }

    @Test(dataProvider = "errorMessages", dataProviderClass = DataObjectProvider.class,
            description = "Verify that correct message is displayed when user submits job application without uploading file")
    public void verifyFileNotUploadMessage(int row, int cell) {
        jobApplicationPage.clickApplyOnlineButton();
        jobApplicationPage.enterApplicantName(getDocument().get("name").toString());
        jobApplicationPage.enterEmail(getDocument().get("email").toString());
        jobApplicationPage.enterPhoneNumber("073".concat(RandomStringUtils.randomNumeric(7)));
        jobApplicationPage.clickSubmitApplicationButton();
        Assert.assertEquals(jobApplicationPage.getUploadErrorMessage(), getCell(row,cell).getStringCellValue());
    }
}
