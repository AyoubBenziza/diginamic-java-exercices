package fr.diginamic.Tests;

import fr.diginamic.Shapes.Circle;
import fr.diginamic.Shapes.Rectangle;
import fr.diginamic.Shapes.Square;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("------ Test Shape -----");
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(5);

        System.out.println("--- Circle ---");
        DisplayShape.display(circle);

        System.out.println("--- Rectangle ---");
        DisplayShape.display(rectangle);

        System.out.println("--- Square ---");
        DisplayShape.display(square);
        System.out.println("------ Test Shape -----");
    }
}
