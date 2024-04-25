package com.ss.foor;

public class Dictionary {
    public static String translation (String word, Language withLanguage, Language toLanguage) {
        return switch (withLanguage) {
            case ENGLISH -> translationToEnglish(word, toLanguage);
            case RUSSIAN -> translationToRussian(word, toLanguage);
        };
    }

    private static String translationToRussian(String word, Language toLanguage) {
        return switch (toLanguage) {
            case ENGLISH -> translationToEnglishCaseWords(word);
            case RUSSIAN -> word;
        };
    }

    private static String translationToEnglishCaseWords(String word) {
        return switch (word) {
            case "собака" -> "dog";
            case "кошка" -> "cat";
            case "мышь" -> "mouse";
            case "крокодил" -> "crocodile";
            case "корова" -> "cow";
            default -> "такого слова нет в словаре";
        };
    }

    private static String translationToEnglish(String word, Language toLanguage) {
        return switch (toLanguage) {
            case ENGLISH -> word;
            case RUSSIAN -> translationToRussianCaseWords(word);
        };
    }

    private static String translationToRussianCaseWords(String word) {
        return switch (word) {
            case "dog" -> "собака";
            case "cat" -> "кошка";
            case "mouse" -> "мышь";
            case "crocodile" -> "крокодил";
            case "cow" -> "корова";
            default -> "такого слова нет в словаре";
        };
    }
}
