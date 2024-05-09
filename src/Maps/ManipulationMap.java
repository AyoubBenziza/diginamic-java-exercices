package Maps;

import java.util.HashMap;

public class ManipulationMap {
    public static void main(String[] args) {
        System.out.println("------ ManipulationMap ------");

        HashMap<Integer, String> mapCities = new HashMap<>();
        mapCities.put(13, "Marseille");
        mapCities.put(34, "Montpellier");
        mapCities.put(44, "Nantes");
        mapCities.put(75, "Paris");
        mapCities.put(31, "Toulouse");
        System.out.println("Map cities: " + mapCities);

        System.out.println("--- Add Objects ---");
        mapCities.put(59, "Lille");
        mapCities.put(69, "Lyon");
        mapCities.put(33, "Bordeaux");
        System.out.println("Map cities: " + mapCities);
        System.out.println("--- Add Objects ---");

        System.out.println("--- Display Keys ---");
        for (Integer key : mapCities.keySet()) {
            System.out.println("Key: " + key);
        }
        System.out.println("--- Display Keys ---");

        System.out.println("--- Display Values ---");
        for (String value : mapCities.values()) {
            System.out.println("Value: " + value);
        }
        System.out.println("--- Display Values ---");

        System.out.println("Map Size: " + mapCities.size());

        System.out.println("------ ManipulationMap ------");
    }
}
