package Tests;

import Operations.calculAverage;

public class TestAverage {
    public static void main(String[] args) {
        System.out.println("------- Test Average ------");
        double[] numbers = {1, 2, 3, 4, 5};
        calculAverage average = new calculAverage(numbers);
        System.out.println("Lessons.Array 1, 2 ,3, 4, 5");
        System.out.println("Average: " + average.calcul());
        System.out.println("-----------------");
        average.addNumber(6);
        System.out.println("Lessons.Array 1, 2 ,3, 4, 6");
        System.out.println("Average: " + average.calcul());
        System.out.println("------- Test Average ------");
    }
}
