package com.ilabquality.qa.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.RemoteWebDriver;

class ILabEngine {

    private static RemoteWebDriver driver;
    private Config config;
    private DatabaseLoader databaseLoader;

    private ExcelLoader excelLoader;

    public ILabEngine() {
        loadConfigs();
        setupWebDriver();
    }

    private void setupWebDriver() {
        if (config.getBrowser().equalsIgnoreCase(BrowserType.CHROME)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (config.getBrowser().equalsIgnoreCase(BrowserType.FIREFOX)) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else
            throw new RuntimeException("Browser not supported.");
    }

    private void loadConfigs() {
        config = new Config();
        new PropertiesLoader();
        excelLoader = new ExcelLoader();
        databaseLoader = new DatabaseLoader(config.getDbCollectionRefId());
    }

    public RemoteWebDriver getDriver() {
        return driver;
    }

    public Config getConfig() {
        return config;
    }

    public DatabaseLoader getDatabaseLoader() {
        return databaseLoader;
    }

    public ExcelLoader getExcelLoader() {
        return excelLoader;
    }

}
