package com.dmdev.cs.homework1;

/**
 * Задание 1

 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes
 * и выводит на консоль в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).

 * Протестировать функцию в main.
 */

public class Task1 {
    public static void main(String[] args) {

        int min = 7;
        int result = isQuarter(min);
        isQuarter(18);
        isQuarter(32);
        isQuarter(55);
        
    }
    //        нужно разделить час на 4 четверти
//        0-14 мин = 1 четверть
//        15-29 мин = 2 четверть
//        30-44 - 3 четверть
//        45-59 - 4 четверть
//        потом сравнить входные данные с этим и вывести четверть
    public static int isQuarter (int min){
        int quarter;
        if (0 <= min && min <= 14) {
            quarter = 1;
            System.out.println("This minute is in " + quarter + " quarter of the hour");
            return quarter;
        }
        else if (15 <= min && min <= 29) {
            quarter = 2;
            System.out.println("This minute is in " + quarter + " quarter of the hour");
            return quarter;
        }
        else if (30 <= min && min <= 44) {
            quarter = 3;
            System.out.println("This minute is in " + quarter + " quarter of the hour");
            return quarter;
        }
        else {
            quarter = 4;
            System.out.println("This minute is in " + quarter + " quarter of the hour");
            return quarter;
        }
        }
    }

