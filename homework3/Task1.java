package com.dmdev.cs.homework3;

import java.util.Arrays;

/**
 * Задание 1
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы
 * (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]

 * Не забывать, что всю логику приложения нужно выносить в отдельные функции.
 * main - только для тестирования написанного функционала.
 */

public class Task1 {

    public static void main(String[] args) {

        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};

        int[] resultArray = removeNegative(values);
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] removeNegative(int[] values) {

        int resultLength = 0;
        for (int value : values) {

            if (value >= 0) {
                resultLength++;
            }
        }

                int[] resultArray = new int[resultLength];
                int index = 0;

                for (int i = 0; i < values.length; i++) {

                    if(values[i] >= 0) {

                        resultArray[index] = values[i];
                        index ++;
                    }

                }

                for (int i = 0; i < resultArray.length; i++) {

                    resultArray[i] = resultArray[i] * resultArray.length;
                }

                return resultArray;
        }
    }
