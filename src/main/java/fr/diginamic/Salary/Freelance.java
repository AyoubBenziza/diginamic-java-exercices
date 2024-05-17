package fr.diginamic.Salary;

public class Freelance extends Contributor {
    private int daysWorked;
    private final double dailyRate;

    public Freelance(String lastName, String firstName, double dailyRate) {
        super(lastName, firstName);
        this.dailyRate = dailyRate;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public double getSalary() {
        return daysWorked * dailyRate;
    }

    public String getStatus() {
        return "Freelance";
    }

    public void displayData() {
        System.out.println("Freelance: " + lastName + " " + firstName);
        System.out.println("Salary: " + getSalary());
        System.out.println("Status: " + getStatus());
    }
}
