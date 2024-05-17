package fr.diginamic.Entities;

public class AddressPostal {
    int number;
    String label;
    int codePostal;
    String city;

    public AddressPostal(int number, String label, int codePostal, String city) {
        this.number = number;
        this.label = label;
        this.codePostal = codePostal;
        this.city = city;
    }
}
