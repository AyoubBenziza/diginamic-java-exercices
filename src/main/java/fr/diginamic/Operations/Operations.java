package fr.diginamic.Operations;

public class Operations {
    public static double calcul(double a, double b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Invalid operator");
        };

    }
}

