package fr.diginamic.Entities;

public class TestAddressPostal {
    public static void main(String[] args) {
        AddressPostal address1 = new AddressPostal(140, "Rives du Lez", 34000, "Montpellier");
        AddressPostal address2 = new AddressPostal(320, "Rue de Paris", 86000, "Poitiers");

        System.out.println("Ville de l'adresse 1" + address1.city);
        System.out.println("Ville de l'adresse 2" + address2.city);
    }
}
