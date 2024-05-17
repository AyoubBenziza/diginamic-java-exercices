package fr.diginamic.Lessons;

public class Loop {
    public static void main(String[] args) {
        System.out.println("---- Lessons.Loop ----");

        // Afficher tous les nombres de 1 à 10
        System.out.println("-- Nombres de 1 à 10 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------");

        // Afficher 20 fois votre nom et prénom
        System.out.println("-- Afficher votre nom et prénom 20x --");
        String lastname = "Benziza";
        String firstname = "Ayoub";
        for (int i = 1; i <= 20; i++) {
            System.out.println("Nom: " + lastname + "\nPrénom: " + firstname);
        }
        System.out.println("-----------------------");

        // Afficher les nombres pairs de 2 à 100
        System.out.println("-- Afficher les nombres pairs de 2 à 100 --");
        for (int j = 2; j <= 100; j = j + 2) {
            System.out.println(j);
        }
        System.out.println("-----------------------");

        // Afficher les nombres impairs de 1 à 99
        System.out.println("-- Afficher les nombres impairs de 1 à 99 --");
        for (int i = 1; i <= 99; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("-----------------------");

        System.out.println("-- Lessons.Array --");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Afficher le premier élément du tableau
        System.out.println("Premier élément du tableau numbers:\n" + numbers[0]);

        // Afficher la longueur du tableau
        System.out.println("Longueur du tableau numbers:\n" + numbers.length);

        // Afficher le dernier élément du tableau en utilisant length
        System.out.println("Premier élément du tableau numbers:\n" + numbers[numbers.length - 1]);

        System.out.println("-- Lessons.Loop Tests --");

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        // Affichage du tableau
        for (int k : array) {
            System.out.println(k);
        }
        // Affichage du tableau dans l'ordre inverse
        for (int l = array.length - 1; l > 0; l--) {
            System.out.println(l);
        }
        int m = 0;
        while (m < array.length) {
            if (array[m] > 3) {
                System.out.println(array[m]);
            }
            m++;
        }

    }
}
