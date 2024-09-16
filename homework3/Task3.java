package com.dmdev.cs.homework3;

import java.util.Arrays;

/**
 * Задание 3
 * Дан одномерный массив целых чисел.

 * Написать функцию, которая принимает этот массив и разбивает на 3 других:
 * с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.

 * Пример:

                                    [-4, -18]

 * [-4, 0, 1, 9, 0, -18, 3] ->      [0, 0]

 *                                  [1, 9, 3]
 */

public class Task3 {

    public static void main(String[] args) {

        int[] values = {-4, 0, 1, 9, 0, -18, 3};
        int[][] sortedValues = sortValues(values);
        System.out.println(Arrays.toString(sortedValues[0]));
        System.out.println(Arrays.toString(sortedValues[1]));
        System.out.println(Arrays.toString(sortedValues[2]));
    }

    private static int[][] sortValues(int[] values) {
        
        int negativeAmount = 0; 
        int positiveAmount = 0; 
        int zeroAmount = 0;

        for (int value : values) {
            if(value > 0) {
                positiveAmount++;
            }
            if(value < 0) {
                negativeAmount++;
            }
            if(value == 0) {
                zeroAmount++;
            }
        }

        int[] negative = new int [negativeAmount];
        int[] positive = new int [positiveAmount];
        int[] zero = new int [zeroAmount];

        int indexNegative = 0;
        int indexPositive = 0;
        int indexZero = 0;

        for (int i = 0; i < values.length; i++) {

            if(values[i] < 0) {
                negative[indexNegative] = values[i];
                indexNegative++;
            }
            else if (values[i] > 0) {
                positive[indexPositive] = values[i];
                indexPositive++;
            }
            else {
                zero[indexZero] = values[i];
                indexZero++;
            }
        }

        return new int[][] {positive, negative, zero};
    }

}
