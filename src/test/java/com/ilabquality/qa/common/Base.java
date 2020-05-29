package com.ilabquality.qa.common;

import org.apache.poi.ss.usermodel.Cell;
import org.bson.Document;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Base {

    private static RemoteWebDriver driver;
    private static Document document;
    private ILabEngine ilab;

    protected static RemoteWebDriver getDriver() {
        return driver;
    }

    protected static Document getDocument() {
        return document;
    }

    @BeforeMethod
    public void setup() {
        ilab = new ILabEngine();
        document = ilab.getDatabaseLoader().getDocument();
        driver = ilab.getDriver();
        navigateToUrl();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    private void navigateToUrl() {
        driver.get(ilab.getConfig().getUrl());
    }

    protected Cell getCell(int row, int cell) {
        return ilab.getExcelLoader().getWorkbook().getSheet("JobApplications").getRow(row).getCell(cell);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
