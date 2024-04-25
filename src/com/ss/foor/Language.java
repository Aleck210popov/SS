package com.ss.foor;

public enum Language {
    ENGLISH,
    RUSSIAN;
    public static Language[] getLanguage() {
        Language[] languages = new Language[] {ENGLISH, RUSSIAN};
        return languages;
    }
}
