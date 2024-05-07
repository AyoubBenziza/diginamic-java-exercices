package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestListString {
    public static void main(String[] args) {
        System.out.println("------ TestListString ------");
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
        System.out.println("List: " + list);
        System.out.println("--- Comparator ---");
        // Comparator
        Comparator<String> comparator = Comparator.comparing(String::length);
        // Max Characters
        System.out.println("Max: " + Collections.max(list, comparator));
        System.out.println("--- Comparator ---");
        System.out.println("--- UpperCase ---");
        // UpperCase
        list.replaceAll(String::toUpperCase);
        System.out.println("List: " + list);
        System.out.println("--- UpperCase ---");
        System.out.println("--- Remove ---");
        // Remove if begins with N
        list.removeIf(s -> s.startsWith("N"));
        System.out.println("List: " + list);
        System.out.println("--- Remove ---");
        System.out.println("------ TestListString ------");
    }
}
