package com.dmdev.cs.homework1;

/**
 * Задание 2

 * Даны 3 переменные:

 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)

 * Написать функцию, которая принимает в качестве параметров
 * эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.

 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */

public class Task2 {
    public static void main(String[] args) {

        double operand1;
        double operand2;
        char operation;

        double resultAddition = isResult(890.387, 0, '+');
        System.out.println(resultAddition);

        double resultDividing = isResult(54435.33,10 , '/');
        System.out.println(resultDividing);

        double resultMultiplying = isResult(568.7878, 100, '*');
        System.out.println(resultMultiplying);

        double resultSubtraction = isResult(0, 7689.33, '-');
        System.out.println(resultSubtraction);

        double result = isResult(4.324, 4.3, '%');
        System.out.println(result);

    }

    public static double isResult(double operand1, double operand2, char operation){

        if (operation == '+') {
            return (operand1 + operand2);
        } else if (operation == '-') {
            return (operand1 - operand2);
        } else if (operation == '*') {
            return (operand1 * operand2);
        } else if (operation == '/') {
            return (operand1 / operand2);
        } else {
            return (operand1 % operand2);
        }
    }

}
