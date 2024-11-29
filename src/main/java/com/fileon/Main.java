package com.fileon;

import javax.swing.*;

import com.fileon.ui.MainFrame;

public class Main {
    public static void main(String[] args) {
        ConfigReader reader = new ConfigReader("config.properties");
        Config config = reader.getConfig();
        SwingUtilities.invokeLater(() -> new MainFrame(config).setVisible(true));
    }
}
