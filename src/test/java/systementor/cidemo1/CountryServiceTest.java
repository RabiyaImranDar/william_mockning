package systementor.cidemo1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class CountryServiceTest {
    @Mock
    CountryApiClient countryApiClient;
    @InjectMocks
    CountryService countryService;
    private final static Logger logger = Logger.getLogger(CountryServiceTest.class.getName());
    private static final Country LATVIA = new Country(
"Latvia",
        "Republic of Latvia",
        "Latvija",
        "Latvijas Republikas",
        "Riga",
        "Europe",
        "Northern Europe",
        Map.of(
        "lav", "Latvian",
        "eng", "English"
        ),
         List.of("EST","LTU", "RUS", "BLR"),
        1829000,
        64559.0,
            "https://goo.gl/maps/iQpUkH7ghq31ZtXe9"
    );
    @Test
    void getSortedLanguagesReturnAlphabeticallySortedLanguages(){
        logger.info("Starting test GetsortedLanguages returns alphabeticallysorted languages");
        when (countryApiClient.fetchCountryByName("Latvia"))
                .thenReturn(LATVIA);

        var result = countryService.getSortedLanguages("Latvia");
        logger.info("Result from get sorted langugaes return " + result);

        assertEquals(List.of("English", "Latvian"), result);
    }

    @Test
    void isHighlyPopulatedReturnsFalseWhenPopulationIsBelowTenMillion(){
        logger.info("Starting test isHighlyPopulatedReturnsFalseWhenPopulationIsBelowTenMillion ");
        when (countryApiClient.fetchCountryByName("Latvia")).thenReturn(LATVIA);

        var result = countryService.isHighlyPopulated("Latvia");
        logger.info("Result from isHighlyPopulated: " + result);

        assertFalse(result);


    }
}
