public class Literal {
    public static void main(String[] args) {
        System.out.println("---- Literal ----");

        // Byte
        byte value_byte = 56;

        // Short
        short value_short = 358;

        // Int (limité à 2.1 milliards)
        int value_int = 19824;

        // Long - mettre un L aux littéraux entiers au delà de 2.1 milliards)
        long value_long = 2200000000L;

        // Float
        float value_float = 12.75f;

        // Double
        double value_double = 13;

        // Char
        char letter = 'a';
        char apostrophe = '\'';
        char unicode = '\u00a9';

        // Boolean
        boolean state = true;

        // String
        String hello = "Hello World";

        // Hiérarchie : double > float > long > int > short > byte

        // Affichage des variables
        System.out.println("Byte:\n" + value_byte);
        System.out.println("Short:\n" + value_short);
        System.out.println("Int:\n" + value_int);
        System.out.println("Long:\n" + value_long);
        System.out.println("Float:\n" + value_float);
        System.out.println("Double:" + value_double);
        System.out.println("Char:\n" + letter);
        System.out.println("Char Apostrophe:\n" + apostrophe);
        System.out.println("Char Unicode:\n" + unicode);
        System.out.println("Boolean:\n" + state);
        System.out.println("String:\n" + hello);
    }
}
