package Sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {
    public static void main(String[] args) {
        System.out.println("------ Test Set Double ------");

        HashSet<Double> set = new HashSet<>(Set.of(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
        System.out.println("Set Double: " + set);

        System.out.println("Max Value: " + Collections.max(set));

        System.out.println("--- Remove Min ---");
        set.remove(Collections.min(set));
        System.out.println("Set Double: " + set);
        System.out.println("--- Remove Min ---");

        System.out.println("------ Test Set Double ------");
    }
}
