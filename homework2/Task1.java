package com.dmdev.cs.homework2;

import java.util.Scanner;

/**
 * Задание 1 - готово
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).

 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value: ");
        int value = scanner.nextInt();
        System.out.println("Amount of even numbers = " + evenNumbers(value));
        System.out.println("Amount of odd numbers = " + oddNumbers(value));
    }

    private static int evenNumbers(int value) {

        int result = 0;
        value = Math.abs(value);
        System.out.println("Even numbers are:");
        while  (value > 0) {
            int number = value % 10;
              if (number % 2 == 0) {
                result ++;
                System.out.println(number);
            }
            value /= 10;
        }
        return result;
    }


    private static int oddNumbers(int value) {

        int result = 0;
        value = Math.abs(value);
        System.out.println("Odd numbers are:");
        while  (value > 0) {
            int number = value % 10;
            if (number % 2 != 0) {
                result ++;
                System.out.println(number);
            }
            value /= 10;
            }
        return result;
        }


}

