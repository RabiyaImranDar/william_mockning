package systementor.cidemo1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ProductApiTest {

    //@Test
    //void getProductsShouldReturn200() {
    //    RestAssured.baseURI = "https://api.example.com";

    //    System.out.println("API_TOKEN is: " + System.getenv("API_TOKEN"));

    //    given()
    //            .auth()
    //            .oauth2(System.getenv("API_TOKEN"))   // ← missing in GitHub → 401
    //            .when()
    //            .get("/products")
    //            .then()
    //            .statusCode(200)                      // ← test FAILAR här
    //            .contentType(ContentType.JSON);
    //    }
}