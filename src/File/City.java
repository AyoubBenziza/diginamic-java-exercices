package File;

public class City {
    private final String name;
    private final String department;
    private final String region;
    private final int population;

    public City(String name, String department, String region, int population) {
        this.name = name;
        this.department = department;
        this.region = region;
        this.population = population;
    }

    @Override
    public String toString() {
        return department + " " + name + " (" + population + "), " + region;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }
}
