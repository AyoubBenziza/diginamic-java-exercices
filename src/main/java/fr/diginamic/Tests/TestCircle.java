package fr.diginamic.Tests;

import fr.diginamic.Entities.Circle;

public class TestCircle {
    public static void main(String[] args) {
        System.out.println("------- Test Circle ------");
        Circle circle = new Circle(5);
        Circle circle2 = new Circle(10);

        System.out.println("------- Circle 1 ------");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("------- Circle 2 ------");
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
        System.out.println("------- Test Circle ------");
    }
}
