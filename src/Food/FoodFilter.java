package Food;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FoodFilter {
    static final String DELIMITER = "\\|";
    static final String dataPath = "src/Food/Data/open-food-facts.csv";
    static final List<String> data = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("------ FoodFilter ------");
        try {
            List<String> lines = Files.readAllLines(Paths.get(dataPath));

            String[] headers = lines.getFirst().split(DELIMITER);
            data.addAll(lines);
            menu();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("------ FoodFilter ------");
    }

    public static void menu() {
        System.out.println("------ Menu Filter ------");
        System.out.println("1. Filter by categorie");
        System.out.println("2. Filter by marque");
        System.out.println("3. Exit");
        System.out.println("------ Menu Filter ------");

        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter category: ");
                String category = new Scanner(System.in).nextLine().trim();
                System.out.println("Nombres de produits par catégorie " + category + ": " + filterByCategory(category).size());
                System.out.println("Export to csv? (y/n)");
                String exportCategory = new Scanner(System.in).next();
                if (exportCategory.equals("y")) {
                    System.out.println("Enter where you which to save the file (from 'src/'): ");
                    String path = new Scanner(System.in).nextLine().trim();
                    exportToCsv(filterByCategory(category), "src/" + path);
                }
                break;
            case 2:
                System.out.println("Enter marque: ");
                String marque = new Scanner(System.in).nextLine().trim();
                System.out.println("Nombres de produits par marque " + marque + ": " + filterByMarque(marque).size());
                System.out.println("Export to csv? (y/n)");
                String exportMarque = new Scanner(System.in).next();
                if (exportMarque.equals("y")) {
                    System.out.println("Enter where you which to save the file (from 'src/'): ");
                    String path = new Scanner(System.in).nextLine().trim();
                    exportToCsv(filterByMarque(marque), "src/" + path);
                }
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public static List<String> filterByCategory(String category) {
        List<String> result = new ArrayList<>();
        // Add header
        result.add(Arrays.toString(data.getFirst().split(DELIMITER)));
        // Check if category is in the data
        for (String line : data) {
            String[] attributes = line.split(DELIMITER);
            if (attributes.length == 0) continue;
            if (attributes[0].equals(category)) {
                System.out.println(Arrays.toString(attributes));
                result.add(Arrays.toString(attributes));
            }
        }
        return result;
    }

    public static List<String> filterByMarque(String marque) {
        List<String> result = new ArrayList<>();
        // Add header
        result.add(Arrays.toString(data.getFirst().split(DELIMITER)));
        // Check if marque is in the data
        for (String line : data) {
            String[] attributes = line.split(DELIMITER);
            if (attributes.length == 0) continue;
            if (attributes[1].equals(marque)) {
                System.out.println(Arrays.toString(attributes));
                result.add(Arrays.toString(attributes));
            }
        }
        return result;
    }

    public static void exportToCsv(List<String> data, String outPath) {
        try {
            Files.write(Paths.get(outPath), data, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("File created: " + outPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
