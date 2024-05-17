package fr.diginamic.Entities;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Benziza", "Ayoub", new AddressPostal(140, "Rives du Lez", 34000, "Montpellier"));
        Person person2 = new Person("Dupont", "Michel", new AddressPostal(320, "Rue de Paris", 86000, "Poitiers"));
//        Person person3 = new Person("Test");

        System.out.println("Je suis " + person1.lastname + " " + person1.firstname + " à " + person1.address.city);
        System.out.println("Je suis " + person2.lastname + " " + person2.firstname + " à " + person2.address.city);
//        System.out.println("Nom:" + person3.lastname);

        person1.display();
        System.out.println(person1.getFirstname());

        person2.setAddress(new AddressPostal(320, "Rue de Versailles", 86000, "Poitiers"));
        System.out.println(person2.address.label);
    }
}
