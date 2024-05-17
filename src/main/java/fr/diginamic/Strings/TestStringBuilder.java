package fr.diginamic.Strings;

public class TestStringBuilder {
    public static void main(String[] args) {
        System.out.println("------ TestStringBuilder ------");
        System.out.println("--- StringBuilder ---");
        long debut = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            sb.append(i);
        }
        System.out.println(sb);

        long fin = System.currentTimeMillis();
        System.out.println("Temps d'exécution: " + (fin - debut) + " ms");

        System.out.println("--- StringBuilder ---");

        System.out.println("--- String ---");
        debut = System.currentTimeMillis();

        String s = "";
        for (int i = 1; i <= 100000; i++) {
            s += i;
        }
        System.out.println(s);

        fin = System.currentTimeMillis();
        System.out.println("Temps d'exécution: " + (fin - debut) + " ms");

        System.out.println("--- String ---");

        System.out.println("------ TestStringBuilder ------");

        // Les résultats sont très différents, le StringBuilder est 100x plus rapide que la concaténation de String.
    }
}
