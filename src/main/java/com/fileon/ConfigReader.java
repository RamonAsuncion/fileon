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
     * Constructs a ConfigReader that loads the given configuration file. If the
     * file cannot be read (e.g., it does not exist or is inaccessible), default
     * values are applied.
     * 
     * @param filePath The path to the configuration file.
     */
    public ConfigReader(String filePath) {
        properties = new Properties();

        try (InputStream inputStream = FileLoader.loadFile(filePath)) {
            if (inputStream == null) {
                System.err.println("Unable to read config file: " + filePath);
                useDefaultConfig();
            } else {
                properties.load(inputStream);
            }
        } catch (IOException ex) {
            System.err.println("Error reading config file: " + filePath);
            useDefaultConfig();
        }
    }

    /**
     * Applies default configuration values when the config file cannot be read or
     * is missing.
     */
    public void useDefaultConfig() {
        properties.setProperty("app.name", "File Explorer");
        properties.setProperty("version", "1.0.0");
    }

    /**
     * Returns the configuration as a {@link Config} object.
     * 
     * @return A {@link Config} object containing the loaded or default properties.
     */
    public Config getConfig() {
        String appName = properties.getProperty("app.name");
        String verison = properties.getProperty("app.version");
        String authorsString = properties.getProperty("app.authors");

        String[] authors = authorsString != null ? authorsString.split(",") : new String[0];

        return new Config(appName, verison, authors);
    }
}
