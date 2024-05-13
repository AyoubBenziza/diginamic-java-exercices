package Utils;

import Annotations.CSV;

import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Export {

    public static void toCSV(List<?> list, String path, char separator) {

        try {
            // Get the class of the first object in the list
            Class<?> objClass = list.getFirst().getClass();

            // Get the fields of the class that have the CSV annotation
            List<Field> fields = new ArrayList<>(Arrays.asList(objClass.getDeclaredFields())).stream()
                    .filter(field -> field.isAnnotationPresent(CSV.class))
                    .sorted(Comparator.comparing(field -> field.getAnnotation(CSV.class).order()))
                    .toList();

            List<String> lines = new ArrayList<>();

            // Create header
            StringBuilder header = new StringBuilder();
            fields.forEach(field -> {
                CSV annotation = field.getAnnotation(CSV.class);
                header.append(annotation.columnName()).append(separator);
            });
            lines.add(header.toString());

            // Create content
            list.forEach(object -> {
                StringBuilder lineBuilder = new StringBuilder();
                fields.forEach(field -> {
                    field.setAccessible(true);
                    try {
                        lineBuilder.append(field.get(object)).append(separator);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                lines.add(lineBuilder.toString());
            });

            // Export to CSV File
            Files.write(Paths.get(path), lines, StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
