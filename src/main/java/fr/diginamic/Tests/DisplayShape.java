package fr.diginamic.Tests;

import fr.diginamic.Shapes.Shape;

public class DisplayShape {
    public static void display(Shape shape) {
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
}
