package systementor.cidemo1;

import java.util.*;
import java.util.stream.Collectors;

public class CountryService {

    private final CountryApiClient apiClient;

    public CountryService(CountryApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public List<String> getSortedLanguages(String name) {
        Country country = apiClient.fetchCountryByName(name);

        return country.getLanguages()
                .values()
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> getSortedBorders(String name) {
        Country country = apiClient.fetchCountryByName(name);

        return country.getBorders()
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public String getRegionInfo(String name) {
        Country country = apiClient.fetchCountryByName(name);
        return country.getRegion() + " / " + country.getSubregion();
    }

    public boolean isHighlyPopulated(String name) {
        Country country = apiClient.fetchCountryByName(name);
        return country.getPopulation() > 10000000;
    }

    public double getPopulationDensity(String name) {
        Country country = apiClient.fetchCountryByName(name);
        if (country.getArea() <= 0) {
            throw new IllegalArgumentException("Area must be greater than 0");
        }
        return (double) country.getPopulation() / country.getArea();
    }

    public String getGoogleMapsUrl(String name) {
        Country country = apiClient.fetchCountryByName(name);
        return country.getGoogleMapsUrl();
    }
}
