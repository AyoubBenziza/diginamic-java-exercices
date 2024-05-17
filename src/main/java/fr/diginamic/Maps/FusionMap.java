package fr.diginamic.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FusionMap {
    public static void main(String[] args) {
        System.out.println("------ FusionMap ------");
        // Création map1
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        // Création map2
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        // Fusion des deux maps dans map3
        HashMap<Integer, String> map3 = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (value1, value2) -> value1, HashMap::new));

        System.out.println("Map 3: " + map3);
        System.out.println("------ FusionMap ------");
    }
}
