package com.ss.three.collections;

import java.util.HashMap;
import java.util.Map;
public class MapWords {

    public static Map<String, Integer> buildWordFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Разделить текст на слова, используя пробел в качестве разделителя
        String[] words = text.split("\\s+");

        // Проходим по каждому слову в тексте
        for (String word : words) {
            // Преобразуем слово в нижний регистр, чтобы учесть случайность
            word = word.toLowerCase();
            // Удаляем знаки препинания (можно настроить список знаков препинания по необходимости)
            word = word.replaceAll("[^а-яА-Яa-zA-Z]", "");

            // Если слово не пустое, добавляем его в словарь и увеличиваем счетчик
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        return wordFrequency;
    }

    public static void startMapWords() {
        String text = "Солнце светило ярко, птицы щебетали весело. Дети играли во дворе, а мама готовила вкусный обед.";

        Map<String, Integer> wordFrequency = buildWordFrequency(text);

        // Выводим результаты
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
