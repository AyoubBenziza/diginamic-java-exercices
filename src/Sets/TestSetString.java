package Sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {
    public static void main(String[] args) {
        System.out.println("------ Test Set String ------");

        HashSet<String> set = new HashSet<String>(Set.of("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
        System.out.println("Set String: " + set);

        Comparator<String> stringComparator = Comparator.comparing(String::length);

        String max = Collections.max(set, stringComparator);
        System.out.println("Max Value: " + max);
        set.remove(max);
        System.out.println("Set String: " + set);

        System.out.println("------ Test Set String ------");
    }
}
