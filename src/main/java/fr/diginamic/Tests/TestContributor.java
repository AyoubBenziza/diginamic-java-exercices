package fr.diginamic.Tests;

import fr.diginamic.Salary.Employee;
import fr.diginamic.Salary.Freelance;

public class TestContributor {
    public static void main(String[] args) {
        System.out.println("------ Test Contributor -----");
        Employee employee = new Employee("Doe", "John", 5000);
        Freelance freelance = new Freelance("Smith", "Jane", 1000);

        freelance.setDaysWorked(10);

        System.out.println("Employee salary: " + employee.getSalary());
        System.out.println("Freelance salary: " + freelance.getSalary());
        System.out.println("--- Display Data ---");
        employee.displayData();
        System.out.println("------");
        freelance.displayData();
        System.out.println("------ Test Contributor -----");
    }
}
