//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        // Int (limité à 2.1 milliards - mettre un L aux littéraux entiers au delà de 2.1 milliards)
        long a = 2200000000L;
        a = 2541;
        // Float
        float price = 12.75f;
        // Double
        double valeur = 13;
        // Char
        char lettre = 'a';
        char apostrophe = '\'';
        char unicode = '\u00a9';

        // Hiérarchie : double > float > long > int > short > byte

        // Affichage des variables
        System.out.println("Long: " + a);
        System.out.println("Float: " + price);
        System.out.println("Double:" + valeur);
        System.out.println("Char: " + lettre);
        System.out.println("Char: " + apostrophe);
        System.out.println("Char: " + unicode);
    }
}