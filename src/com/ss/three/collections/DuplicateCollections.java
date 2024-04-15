package com.ss.three.collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCollections {

    public static <T> List<T> removeDuplicates(List<T> list) {
        // Создаем новый список для хранения уникальных элементов
        List<T> uniqueList = new ArrayList<>();

        // Проходим по каждому элементу в исходном списке
        for (T item : list) {
            // Если элемент уже не содержится в уникальном списке, добавляем его
            if (!uniqueList.contains(item)) {
                uniqueList.add(item);
            }
        }

        return uniqueList;
    }

    public static void startDuplicateCollections() {
        // Пример использования метода
        List<Integer> numbersWithDuplicates = new ArrayList<>();
        numbersWithDuplicates.add(1);
        numbersWithDuplicates.add(2);
        numbersWithDuplicates.add(3);
        numbersWithDuplicates.add(1); // Дубликат
        numbersWithDuplicates.add(4);

        System.out.println("Список с дубликатами: " + numbersWithDuplicates);

        List<Integer> uniqueNumbers = removeDuplicates(numbersWithDuplicates);

        System.out.println("Список без дубликатов: " + uniqueNumbers);
    }
}
