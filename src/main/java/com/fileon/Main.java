package com.fileon;

import com.fileon.ui.MainFrame;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainFrame.setVisible(true);
            }
        });
    }

}
