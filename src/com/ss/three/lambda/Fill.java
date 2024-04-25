package com.ss.three.lambda;

import java.util.function.Function;

public class Fill {
    public static void startFill() {
        String[] squares = new String[10];
        fill(squares, n -> String.valueOf(n * n));
        Integer[] arr = new Integer[20];
        fill(arr, n -> n * n);


        // Проверка
        for (String square : squares) {
            System.out.print(square + " ");
        }
        System.out.println();
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static <T>  void fill(T[] array, Function<Integer, T> function) {
        for (int i = 0; i < array.length; i++) {
            array[i] = function.apply(i);
        }
    }
}
