package com.ss.three.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class ListPerformanceTest {
    public static void addElementsToLists() {
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Преобразуем наносекунды в миллисекунды
        System.out.println("Время добавления 1000000 элементов в ArrayList: " + duration + " мс");

        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Преобразуем наносекунды в миллисекунды
        System.out.println("Время добавления 1000000 элементов в LinkedList: " + duration + " мс");
    }

    public static void getRandomElements(List<Integer> list) {
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            int randomIndex = random.nextInt(list.size());
            Integer element = list.get(randomIndex);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Преобразуем наносекунды в миллисекунды
        System.out.println("Время выборки 100000 случайных элементов из списка: " + duration + " мс");
    }

    public static void startListPerformanceTest() {
        addElementsToLists();

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        getRandomElements(arrayList);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        getRandomElements(linkedList);
    }
}
