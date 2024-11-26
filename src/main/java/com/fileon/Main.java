package com.fileon;

// import javax.swing.*;
// import java.awt.*;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        try {
            ConfigReader reader = new ConfigReader("config.properties");
            Properties properties = reader.getProperties();
            String appName = properties.getProperty("app.name");
            System.out.println("App name: " + appName);
        } catch (IOException e) {
            System.err.println("Error reading config file: " + e.getMessage());
        }
    }

}
