package com.dmdev.cs.homework3;

import java.util.Arrays;

/**
 * Задание 2
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа
 * (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 *
 * Далее определить среднее арифметическое всех элементов целочисленного массива
 * и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */

public class Task2 {

    public static void main(String[] args) {

        char[] values = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};

        int[] resultArray = charsToInt(values);
        System.out.println("New array is " + Arrays.toString(resultArray));
    }

    private static int[] charsToInt(char[] values) {
        int[] resultArray = new int[values.length];
        int sum = 0;


        for (int i = 0; i < values.length; i++) {

            resultArray[i] = (int) values[i];   // преобразует символ в код этого символа
        }

        for (int i = 0; i < values.length; i++) {

            sum += resultArray[i];
        }

        int average = sum / values.length;
        System.out.println("Average is " + average);
        System.out.println("Above average are: ");

        for (int i = 0; i < values.length; i++) {

            if (resultArray[i] > average) {
                System.out.print(resultArray[i] + " ");
            }


        } System.out.println();

        return resultArray;
    }
}
