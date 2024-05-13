package Enumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        System.out.println("------ Test Season Enumeration ------");
        System.out.println("Seasons:");
        for (Season season : Season.values()) {
            System.out.println(season.label + " " + season.order);
        }
        // Display the name of the season where the label is "SUMMER"
        System.out.println("Season with label \"SUMMER\": " + Season.valueOf("SUMMER").label);


        // Display an instance of the season of the label "Winter"
        String label = "Winter";
        Season season = Season.valueOfLabel(label);
        System.out.println("Season with label \"" + label + "\": " + season.label);
        System.out.println("------ Test Season Enumeration ------");
    }
}
