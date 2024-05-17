package fr.diginamic.Recensement.Entities;

import fr.diginamic.Recensement.Comparators.ComparatorPopulationDepartement;
import fr.diginamic.Recensement.Comparators.ComparatorPopulationRegion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recensement {
    private static final List<City> cities = new ArrayList<>();

    public void lireFichier(String dataPath) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(dataPath));
            String header = lines.removeFirst();
            for (String line : lines) {
                String[] attributes = line.split(";");
                if (attributes.length == 0) continue;

                int codeRegion = Integer.parseInt(attributes[0]);
                String nomRegion = attributes[1];
                String codeDepartement = attributes[2];
                String codeCommune = attributes[5];
                String nomCommune = attributes[6];
                int populationTotale = Integer.parseInt(attributes[9].replaceAll(" ", ""));

                cities.add(new City(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void afficherDonnees() {
        for (City city : cities) {
            System.out.println(city.getNomCommune() + " - " + city.getPopulationTotale());
        }
    }

    public List<City> getCities() {
        return cities;
    }

    public City getCityByName(String name) {
        for (City city : cities) {
            if (city.getNomCommune().equals(name)) {
                return city;
            }
        }
        return null;
    }

    public List<City> getCityByPopulation(int population) {
        List<City> filteredCities = new ArrayList<>();
        for (City city : cities) {
            if (city.getPopulationTotale() > population) {
                filteredCities.add(city);
            }
        }
        return filteredCities;
    }

    public List<City> getCityByRegion(String region) {
        List<City> filteredCities = new ArrayList<>();
        for (City city : cities) {
            if (city.getNomRegion().equals(region)) {
                filteredCities.add(city);
            }
        }
        return filteredCities;
    }

    public List<City> getCityByDepartment(String department) {
        if (Integer.parseInt(department) < 10) {
            department = "0" + department;
        }
        List<City> filteredCities = new ArrayList<>();
        for (City city : cities) {
            if (city.getCodeDepartement().equals(department)) {
                filteredCities.add(city);
            }
        }
        return filteredCities;
    }

    public int getPopulationByRegion(String region) {
        int population = 0;
        for (City city : cities) {
            if (city.getNomRegion().equals(region)) {
                population += city.getPopulationTotale();
            }
        }
        return population;
    }

    public int getPopulationByDepartement(String department) {
        if (Integer.parseInt(department) < 10) {
            department = "0" + department;
        }
        int population = 0;
        for (City city : cities) {
            if (city.getCodeDepartement().equals(department)) {
                population += city.getPopulationTotale();
            }
        }
        return population;
    }

    public int getPopulationByCity(String city) {
        int population = 0;
        for (City c : cities) {
            if (c.getNomCommune().equals(city)) {
                population = c.getPopulationTotale();
            }
        }
        return population;
    }

    public List<City> getMostPopulatedCities(int nbCities) {
        List<City> mostPopulatedCities = new ArrayList<>();
        for (int i = 0; i < nbCities; i++) {
            City mostPopulatedCity = cities.getFirst();
            for (City city : cities) {
                if (city.getPopulationTotale() > mostPopulatedCity.getPopulationTotale()) {
                    mostPopulatedCity = city;
                }
            }
            mostPopulatedCities.add(mostPopulatedCity);
            cities.remove(mostPopulatedCity);
        }
        return mostPopulatedCities;
    }

    public List<City> getMostPopulatedCitiesByRegion(String region, int nbCities) {
        List<City> mostPopulatedCities = new ArrayList<>();
        List<City> citiesByRegion = getCityByRegion(region);
        for (int i = 0; i < nbCities; i++) {
            City mostPopulatedCity = citiesByRegion.getFirst();
            for (City city : citiesByRegion) {
                if (city.getPopulationTotale() > mostPopulatedCity.getPopulationTotale()) {
                    mostPopulatedCity = city;
                }
            }
            mostPopulatedCities.add(mostPopulatedCity);
            citiesByRegion.remove(mostPopulatedCity);
        }
        return mostPopulatedCities;
    }

    public List<City> getMostPopulatedCitiesByDepartment(String department, int nbCities) {
        List<City> mostPopulatedCities = new ArrayList<>();
        List<City> citiesByDepartment = getCityByDepartment(department);
        for (int i = 0; i < nbCities; i++) {
            City mostPopulatedCity = citiesByDepartment.getFirst();
            for (City city : citiesByDepartment) {
                if (city.getPopulationTotale() > mostPopulatedCity.getPopulationTotale()) {
                    mostPopulatedCity = city;
                }
            }
            mostPopulatedCities.add(mostPopulatedCity);
            citiesByDepartment.remove(mostPopulatedCity);
        }
        return mostPopulatedCities;
    }

    public List<Region> getMostPopulatedRegion(int nbRegions) {
        List<Region> regions = new ArrayList<>();
        for (City city : cities) {
            Region region = new Region(city.getCodeRegion(), city.getNomRegion());
            if (!regions.contains(region)) {
                regions.add(region);
            }
        }
        for (Region region : regions) {
            int population = 0;
            for (City city : cities) {
                if (city.getCodeRegion() == region.getCodeRegion()) {
                    population += city.getPopulationTotale();
                }
            }
            region.setPopulationTotale(population);
        }
        regions.sort(new ComparatorPopulationRegion().reversed());
        return regions.subList(0, nbRegions);


    }

    public List<Departement> getMostPopulatedDepartments(int nbDepartments) {
        List<Departement> departments = new ArrayList<>();
        for (City city : cities) {
            Departement department = new Departement(city.getCodeDepartement(), city.getPopulationTotale());
            if (!departments.contains(department)) {
                departments.add(department);
            }
        }
        departments.sort(new ComparatorPopulationDepartement().reversed());
        return departments.subList(0, nbDepartments);
    }
}
