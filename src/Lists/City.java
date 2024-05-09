package Lists;

public class City {
    public String name;
    public int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return name + " (" + population + ")";
    }

}
