package com.dmdev.oop.lesson7.homework4;

/**
 * Задание 1
 * Представить в виде классов и их композиции следующую модель.
 * <p>
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * <p>
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * <p>
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * <p>
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * <p>
 * В каждом классе реализовать метод print, который на консоль выводит информацию
 * об объекте (должны присутствовать все поля объекта!).
 * <p>
 * Например, метод print класса этаж должен выводить на консоль:
 * <p>
 * “Этаж 2, количество квартир 18”
 * <p>
 * Создание всех объектов вынести в отдельный класс с методом main.
 * <p>
 * Там же реализовать метод printAllInformation, который на вход принимает
 * объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах,
 * вызывая методы print.
 */

public class HouseRunner {

    public static void main(String[] args) {

        Room[] rooms1 = {new Room(true), new Room(false)};
        Room[] rooms2 = {new Room(false), new Room(true)};
        Room[] rooms3 = {new Room(true)};
        Room[] rooms4 = {new Room(false)};
        Room[] rooms5 = {new Room(true),
                new Room(true), new Room(false)};
        Room[] rooms6 = {new Room(false),
                new Room(true), new Room(true)};

        Apartment[] apartments1 = {new Apartment(1, rooms1),};
        Apartment[] apartments2 = {new Apartment(2, rooms2), new Apartment(3, rooms3)};
        Apartment[] apartments3 = {new Apartment(4, rooms4), new Apartment(5, rooms5),
                new Apartment(6, rooms6)};

        Floor[] floors = {new Floor(1, apartments1),
                new Floor(2, apartments2),
                new Floor(3, apartments3)};

        House house = new House(234, floors);

        print(house);

        printAllInformation(house);
    }

    private static void printAllInformation(House house) {

        for (Floor floor : house.getFloors()) {
            floor.printState();
            {
                for (Apartment apartment : floor.getApartments()) {
                    apartment.printState();
                    {
                        for (Room room : apartment.getRooms()) {
                            room.printState();
                        }
                    }
                }
            }
        }

    }

    private static void print(House house) {
        house.printState();
    }


}
