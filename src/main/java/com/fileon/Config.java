package com.fileon;

import lombok.Getter;

@Getter
public class Config {
    private final String appName;
    private final String version;
    private final String[] authors;

    public Config(String appName, String version, String[] authors) {
        this.appName = appName;
        this.version = version;
        this.authors = authors != null ? authors.clone() : new String[0];
    }
}
