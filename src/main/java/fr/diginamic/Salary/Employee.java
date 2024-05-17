package fr.diginamic.Salary;

public class Employee extends Contributor {
    private final double salary;

    public Employee(String lastName, String firstName, double salary) {
        super(lastName, firstName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getStatus() {
        return "Employee";
    }

    public void displayData() {
        System.out.println("Employee: " + lastName + " " + firstName);
        System.out.println("Salary: " + getSalary());
        System.out.println("Status: " + getStatus());
    }
}
