package fr.diginamic.Maps;

import java.util.HashMap;
import java.util.Map;

public class CreateMap {
    public static void main(String[] args) {
        System.out.println("------ CreateMap ------");
        Map<String, Integer> mapSalaries = new HashMap<>(
                Map.of(
                        "John", 1000,
                        "Paul", 1500,
                        "George", 1300,
                        "Ringo", 1100
                )
        );
        System.out.println("Map salaries: " + mapSalaries);
        System.out.println("Size of mapSalaries: " + mapSalaries.size());

        System.out.println("------ CreateMap ------");
    }
}
