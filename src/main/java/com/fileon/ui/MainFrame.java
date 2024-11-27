package com.fileon.ui;

import javax.swing.*;

// try {
// ConfigReader reader = new ConfigReader("config.properties");
// Properties properties = reader.getProperties();
// String appName = properties.getProperty("app.name");
// System.out.println("App name: " + appName);
// } catch (IOException e) {
// System.err.println("Error reading config file: " + e.getMessage());
// }

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
    }
}
