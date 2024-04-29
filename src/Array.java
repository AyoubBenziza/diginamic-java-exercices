public class Array {
    public static void main(String[] args) {
        System.out.println("---- Array ----");

        System.out.println("-- Students --");
        // Tableau
        String[] students = {"Abdelac", "Mickaël", "Chérazad", "Noémie", "Antoine"};

        // N'affiche rien
//        System.out.println(students);

        // Affichage
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);
        System.out.println("Longueur du tableau students:\n" + students.length);

        System.out.println("-- Numbers --");
        // Tableau
        int[] numbers = {8, -7, 12, 1, -2, 14, 17, 9};

        // Affichage
        System.out.println("Premier élement du tableau numbers:\n" + numbers[0]);
        System.out.println("Longueur du tableau numbers:\n" + numbers.length);
        // Echouera car nous avons pas d'11ème valeur dans notre tableau numbers (commence toujours par index 0)
//        System.out.println(numbers[10]);

        System.out.println("-- Cities --");
        // Tableau
        String[] cities = {"Montpellier", "Paris", "Poitiers", "Nantes", "Nîmes"};

        // Affichage
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Ville:\n" + cities[i]);
        }
        System.out.println("Longueur du tableau cities:\n" + cities.length);
        cities[3] = "Reims";
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Ville:\n" + cities[i]);
        }

    }
}
