package fr.diginamic.Annotations;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Country {
    @ToString(name = "country", uppercase = false, separator = "->")
    private String name;
    int population;
    @ToString(separator = " $")
    private double GDPPerCapita;

    public Country(String name, int population, double PIBPerCapita) {
        this.name = name;
        this.population = population;
        this.GDPPerCapita = PIBPerCapita;
    }

    @Override
    public String toString() {
        List<Field> fields = new ArrayList<>(Arrays.asList(this.getClass().getDeclaredFields()));
        List<Field> filteredFields = fields.stream()
                .filter(field -> field.isAnnotationPresent(ToString.class))
                .toList();
        StringBuilder lineBuilder = new StringBuilder();
        filteredFields.forEach(field -> {
            field.setAccessible(true);
            try {
                ToString annotation = field.getAnnotation(ToString.class);
                String value = field.get(this).toString();
                if (annotation.uppercase()) {
                    value = value.toUpperCase();
                }
                lineBuilder.append(annotation.name() + " " + value + annotation.separator());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return lineBuilder.toString();
    }
}
