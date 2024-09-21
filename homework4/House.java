package com.dmdev.oop.lesson7.homework4;

public class House {

    private int number;
    private Floor[] floors;

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public void printState() {
        System.out.println("Номер дома: " + number + "; количество этажей в доме: "
                + floors.length);
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }


}
