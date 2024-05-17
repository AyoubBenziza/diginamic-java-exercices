package fr.diginamic.Home;

abstract public class Room {
    protected double area;
    protected int floor;

    Room(double area, int floor) {
        this.area = area;
        this.floor = floor;
    }
}
