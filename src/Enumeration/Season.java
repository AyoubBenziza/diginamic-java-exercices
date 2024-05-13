package Enumeration;

public enum Season {
    SPRING, SUMMER, FALL, WINTER;
    public final String label = name();
    public final int order = ordinal() + 1;

    // Returns an instance of the season of the param label
    public static Season valueOfLabel(String label) {
        for (Season season : values()) {
            if (season.label.equals(label.toUpperCase())) {
                return season;
            }
        }
        return null;
    }
}
