package fr.diginamic.Entities;

public class Person {
    public String lastname;
    public String firstname;
    public AddressPostal address;

//    Person(String lastname) {
//        this.lastname = lastname;
//    }

    Person(String lastname, String firstname, AddressPostal address) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
    }

    // Getters
    void setLastname(String lastname) {
        this.lastname = lastname;
    }

    void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    void setAddress(AddressPostal address) {
        this.address = address;
    }

    // Setters
    String getLastname() {
        return this.lastname;
    }

    String getFirstname() {
        return this.firstname;
    }

    AddressPostal getAddress() {
        return this.address;
    }

    void display() {
        System.out.println("Lastname: " + this.lastname.toUpperCase() + "\nFirstname: " + this.firstname);
    }
}
