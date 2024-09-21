package com.dmdev.oop.lesson7.homework4;

public class Apartment {

    private int number;
    private Room[] rooms;

    public Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public void printState() {
        System.out.println("Номер квартиры: " + number + "; количество комнат в квартире: "
                + rooms.length);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

}
