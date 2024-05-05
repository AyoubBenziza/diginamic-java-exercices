package Strings;

import java.util.Arrays;

import Entities.Employee;

public class ManipulationString {
    public static void main(String[] args) {
        System.out.println("------- Manipulation String ------");
        String string = "Durand;Marcel;2 523.5";

        char firstLetter = string.charAt(0);
        System.out.println("First letter: " + firstLetter);

        int length = string.length();
        System.out.println("Length: " + length);

        int index = string.indexOf(";");
        System.out.println("Index of ';': " + index);

        String lastName = string.substring(0, index);
        System.out.println("Last name in UpperCase: " + lastName.toUpperCase());
        System.out.println("Last name in LowerCase: " + lastName.toLowerCase());

        String[] parts = string.split(";");
        System.out.println("Array: " + Arrays.toString(parts));

        System.out.println("--- Employee ---");
        Employee employee = new Employee(parts[0], parts[1], Double.parseDouble(parts[2].replace(" ", "")));
        System.out.println("Last name: " + employee.lastName);
        System.out.println("First name: " + employee.firstName);
        System.out.println("Salary: " + employee.salary);
        System.out.println("------- Manipulation String ------");
    }
}
