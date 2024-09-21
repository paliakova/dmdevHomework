package com.dmdev.oop.lesson7.homework4;

public class Room {

    private boolean walkThrough;

    public Room(boolean walkThrough) {
        this.walkThrough = walkThrough;
    }

    public void printState() {
        System.out.println("Комната проходная: " + isWalkThrough());
    }


    public boolean isWalkThrough() {
        return walkThrough;
    }

    public void setWalkThrough(boolean walkThrough) {
        this.walkThrough = walkThrough;
    }


}
