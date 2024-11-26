package com.fileon;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Handles loading files from either the classpath or the file system.
 */
public class FileLoader {
    /**
     * Tries to load a file from the classpath or the filesystem.
     * 
     * @param filePath The path to the file.
     * @return An InputStream for the file.
     * @throws IOException If the file cannot be found or read.
     */
    public static InputStream loadFile(String filePath) throws IOException {
        InputStream inputStream = FileLoader.class.getClassLoader().getResourceAsStream(filePath);

        if (inputStream == null) {
            try {
                inputStream = new FileInputStream(filePath);
            } catch (IOException ex) {
                throw new IOException("Unable to load file: " + filePath);
            }
        }
        return inputStream;
    }
}
