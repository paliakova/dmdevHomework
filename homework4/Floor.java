package com.dmdev.oop.lesson7.homework4;

public class Floor {

    private int number;
    private Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public void printState() {
        System.out.println("Номер этажа: " + number + "; количество квартир на этаже: "
                + apartments.length);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Apartment[] getApartments() {
        return apartments;
    }


    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }


}
