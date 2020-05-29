package com.ilabquality.qa.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

class PropertiesLoader {

    private static final String PROPERTIES_FILE_NAME = "ilab.properties";
    private Properties properties;

    PropertiesLoader() {
        loadProperties();
    }

    private void loadProperties() {
        properties = new Properties();
        try {
            InputStream inputStream = getClass()
                    .getClassLoader().getResourceAsStream(PROPERTIES_FILE_NAME);
            properties.load(inputStream);
            Objects.requireNonNull(inputStream).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Properties getProperties() {
        return properties;
    }

}
