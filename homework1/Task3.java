package com.dmdev.cs.homework1;

/**
 *Задание 3

 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника
 * и затем эти площади сравниваются друг с другом.

 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит
 * на консоль - первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */

public class Task3 {
    public static void main(String[] args) {

        int a1 = 10;
        int b1 = 8;
        int a2 = 3;
        int b2 = 90;

        double area1 = calculateTriangleArea(a1, b1);
        double area2 = calculateTriangleArea(a2, b2);

        compareTriangleAreas(area1, area2);
    }

    public static void compareTriangleAreas (double firstTriangleArea, double secondTriangleArea) {

        if (firstTriangleArea == secondTriangleArea) {
            System.out.println("First triangle area equals second triangle area");
        } else if (firstTriangleArea > secondTriangleArea) {
            System.out.println("First triangle area is more than second triangle area");
        } else {
            System.out.println("Second triangle is more than first triangle area");
        }
    }


    public static double calculateTriangleArea (int aSide, int bSide) {

        return ((double) (aSide * bSide) / 2);
    }

}
