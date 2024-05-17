package Enumeration;

public enum Continent {
    AFRICA("Africa"), AMERICA("America"), ASIA("Asia"), EUROPE("Europe"), OCEANIA("Oceania");
    private final String label;

    Continent(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static Continent valueOfLabel(String label) {
        for (Continent continent : values()) {
            if (label.equals(continent.getLabel())) {
                return continent;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return label;
    }
}
