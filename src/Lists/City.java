package Lists;

public class City {
    String name;
    int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return name + " (" + population + ")";
    }

}
