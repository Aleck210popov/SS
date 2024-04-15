package com.javauser.narfu.three.lambda;

import java.util.function.Predicate;

public class Filter {
    public static void startFilter() {
        // Пример использования filter для удаления пустых строк из массива строк
        String[] strings = {"hello", "", "world", "", "java"};
        filter(strings, s -> !s.isEmpty());

        // Печатаем отфильтрованные строки
        for (String str : strings) {
            System.out.println(str);
        }
        System.out.println();
    }

    public static <T> void filter(T[] array, Predicate<T> predicate) {
        int index = 0;
        for (T element : array) {
            if (predicate.test(element)) {
                array[index++] = element;
            }
        }
        // Заполняем оставшуюся часть массива null'ами
        for (int i = index; i < array.length; i++) {
            array[i] = null;
        }
    }
}
