package com.fileon;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import lombok.Getter;

/*
 * Loads configuration properties from a file.
 */
public class ConfigReader {
    @Getter
    private Properties properties;

    /**
     * Constructs a ConfigReader that loads the given configuration file.
     * 
     * @param filePath The path to the configuration file.
     * @throws IOException If the file cannot be found or read.
     */
    public ConfigReader(String filePath) throws IOException {
        properties = new Properties();

        try (InputStream inputStream = FileLoader.loadFile(filePath)) {
            if (inputStream == null) {
                throw new IOException("Unable to read config file: " + filePath);
            }
            properties.load(inputStream);
        }
    }
}
