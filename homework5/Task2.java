package homework5;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.

 * Написать 2 метода:

 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива

 * Посчитать сумму всех чисел из строки

 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task2 {
    public static void main(String[] args) {

        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] digits = convertToDigits(value);
        int sum = sumDigits(digits);
        System.out.println("Цифры: " + Arrays.toString(digits));
        System.out.println("Сумма цифр: " + sum);
    }

    private static int sumDigits(int[] digits) {

        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    private static int[] convertToDigits(String value) { // возможно нужно убрать пробелы

        String result = "";
        int i = value.indexOf(value);
        int digitCount = 0;

        for (i = 0; i < value.length(); i++) {
            char currentChar = value.charAt(i);
            boolean digit = Character.isDigit(currentChar);
            if (digit) {
                result += currentChar;
                digitCount++;
            }
        }

        int[] digits = new int[digitCount];
        int index = 0;

        for (i = 0; i < value.length(); i++) {
            char currentChar = value.charAt(i);
            boolean digit = Character.isDigit(currentChar);
            if (digit) {
                digits[index] = Character.getNumericValue(currentChar);
                index++;
            }
        }
        return digits;
    }
}
