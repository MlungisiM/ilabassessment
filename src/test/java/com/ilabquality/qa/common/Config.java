package com.ilabquality.qa.common;

public class Config extends PropertiesLoader {

    private final String browser;
    private final String url;
    private final String dbCollectionRefId;

    public Config() {
        this.browser = getProperties().getProperty("selenium.browser.name");
        this.url = getProperties().getProperty("ilab.website.url");
        this.dbCollectionRefId = getProperties().getProperty("db.mongo.document.refid");
    }

    public String getBrowser() {
        return browser;
    }

    public String getUrl() {
        return url;
    }

    public String getDbCollectionRefId() {
        return dbCollectionRefId;
    }
}
