package com.dmdev.cs.homework2;

import java.util.Scanner;

/**
 * Задание 2 - готово
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321

 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value: ");
        int value = scanner.nextInt();
        System.out.println("Reverse for " + value + " is " + reverseNumber(value));
    }

    private static int reverseNumber(int value) {

        int reverse = 0;
        value = Math.abs(value);
        int numberOfDigits = (int) Math.log10(value) + 1;

        for (int rightPosition = 0; rightPosition < numberOfDigits; rightPosition++) {

            int currentDigit = value % 10;
            reverse += (int) (currentDigit * Math.pow(10, numberOfDigits - rightPosition - 1));
            value /= 10;
        }
//     
        return reverse;
    }

}
