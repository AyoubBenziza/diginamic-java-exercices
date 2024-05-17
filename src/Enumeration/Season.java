package Enumeration;

public enum Season {
    SPRING("Spring", 1), SUMMER("Summer", 2), FALL("Fall", 3), WINTER("Winter", 4);

    private final String label;
    private final int order;

    Season(String label, int order) {
        this.label = label;
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public String getLabel() {
        return label;
    }

    // Returns an instance of the season of the param label
    public static Season valueOfLabel(String label) {
        for (Season season : values()) {
            if (label.equals(season.getLabel())) {
                return season;
            }
        }
        return null;
    }
}
