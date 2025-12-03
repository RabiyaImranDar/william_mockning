package systementor.cidemo1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SystementorSeleniumTest {

    Logger logger = Logger.getLogger(SystementorSeleniumTest.class.getName());





    @Test
    void testNavigateToOmOss(){
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");

        //Headless kör utan ett fönster, allt körs alltså i bakgrunden
        // stänger av chromes interna säkerhetsisolering så att webbläsaren kan köras även i CI-containrar utan fulla systemrättigheter
        // disable-dev-shm-usage - använd inte delat minne för att lagra data som tex renderade sidor, ci minne är oftast ganska litet (ungefär 64mb)



        // Startar server
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://systementor.se/");
        logger.info("Navigated to Systementor");

        WebElement omOssKlick = driver.findElement(By.linkText("Om oss"));

        // Klicka
        omOssKlick.click();
        logger.info("Clicked on Om oss");

        try {Thread.sleep(2000);} catch (InterruptedException e) {}

        String currentUrl = driver.getCurrentUrl();
        String title = driver.getTitle();

        assertTrue(currentUrl.contains("Om oss") || title.contains("Om oss"));
        logger.info("After click it lands on the Om oss page");


        driver.quit();





    }



}
