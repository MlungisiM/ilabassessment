package com.ilabquality.qa.common;

import org.testng.annotations.DataProvider;

public class DataObjectProvider {

    @DataProvider(name = "errorMessages")
    public Object[][] getErrorMessages() {
        return new Object[][] { { 1, 2}, {2, 2  } };
    }
}
