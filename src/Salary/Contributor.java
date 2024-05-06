package Salary;

abstract public class Contributor {
    protected String lastName;
    protected String firstName;

    public Contributor(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    abstract public double getSalary();

    abstract public void displayData();

    abstract public String getStatus();
}
