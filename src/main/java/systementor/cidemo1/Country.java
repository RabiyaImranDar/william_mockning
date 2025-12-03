package systementor.cidemo1;

import java.util.*;

public class Country {

    private final String nameCommon;
    private final String nameOfficial;
    private final String nameNativeCommon;
    private final String nameNativeOfficial;
    private final String capital;
    private final String region;
    private final String subregion;
    private final Map<String, String> languages;
    private final List<String> borders;
    private final int population;
    private final double area;
    private final String googleMapsUrl;

    public Country(String nameCommon,
                   String nameOfficial,
                   String nameNativeCommon,
                   String nameNativeOfficial,
                   String capital,
                   String region,
                   String subregion,
                   Map<String, String> languages,
                   List<String> borders,
                   int population,
                   double area,
                   String googleMapsUrl) {

        this.nameCommon = nameCommon;
        this.nameOfficial = nameOfficial;
        this.nameNativeCommon = nameNativeCommon;
        this.nameNativeOfficial = nameNativeOfficial;
        this.capital = capital;
        this.region = region;
        this.subregion = subregion;
        this.languages = languages;
        this.borders = borders;
        this.population = population;
        this.area = area;
        this.googleMapsUrl = googleMapsUrl;
    }

    public String getNameCommon() { return nameCommon; }

    public String getNameOfficial() { return nameOfficial; }

    public String getNameNativeCommon() { return nameNativeCommon; }

    public String getNameNativeOfficial() { return nameNativeOfficial; }

    public String getCapital() { return capital; }

    public String getRegion() { return region; }

    public String getSubregion() { return subregion; }

    public Map<String, String> getLanguages() { return languages; }

    public List<String> getBorders() { return borders; }

    public int getPopulation() { return population; }

    public double getArea() { return area; }

    public String getGoogleMapsUrl() { return googleMapsUrl; }
}

