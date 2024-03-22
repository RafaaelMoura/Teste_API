package Get;

import org.junit.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
///import org.hamcrest.Matchers;

public class ListerUser {

@Test
public void testname() {
        given()
            .log().all()
            .contentType(ContentType.JSON)
        .when()
            .get("https://reqres.in/api/users?page=2")
        .then()
            .log().all()
            .contentType(ContentType.JSON)
            .statusCode(200)
                .body("page", equalTo(2))
                .body("data.size()", greaterThan(0))
                .body("data", notNullValue())
                .body("data", hasSize(greaterThan(0)))
                /// ID 7
                .body("data.findAll { it.id == 7 }.email", hasItem("michael.lawson@reqres.in"))
                .body("data.findAll { it.id == 7 }.first_name", hasItem("Michael")) 
                .body("data.findAll { it.id == 7 }.last_name", hasItem("Lawson"))
                .body("data.findAll { it.id == 7 }.avatar", hasItem("https://reqres.in/img/faces/7-image.jpg"))
                /// ID 8
                .body("data.findAll { it.id == 8 }.email", hasItem("lindsay.ferguson@reqres.in"))
                .body("data.findAll { it.id == 8 }.first_name", hasItem("Lindsay")) 
                .body("data.findAll { it.id == 8 }.last_name", hasItem("Ferguson"))
                .body("data.findAll { it.id == 8 }.avatar", hasItem("https://reqres.in/img/faces/8-image.jpg"))
                /// ID 9
                .body("data.findAll { it.id == 9 }.email", hasItem("tobias.funke@reqres.in"))
                .body("data.findAll { it.id == 9 }.first_name", hasItem("Tobias")) 
                .body("data.findAll { it.id == 9 }.last_name", hasItem("Funke"))
                .body("data.findAll { it.id == 9 }.avatar", hasItem("https://reqres.in/img/faces/9-image.jpg"))
                /// ID 10
                .body("data.findAll { it.id == 10 }.email", hasItem("byron.fields@reqres.in"))
                .body("data.findAll { it.id == 10 }.first_name", hasItem("Byron")) 
                .body("data.findAll { it.id == 10 }.last_name", hasItem("Fields"))
                .body("data.findAll { it.id == 10 }.avatar", hasItem("https://reqres.in/img/faces/10-image.jpg"))
                /// ID 11
                .body("data.findAll { it.id == 11 }.email", hasItem("george.edwards@reqres.in"))
                .body("data.findAll { it.id == 11 }.first_name", hasItem("George")) 
                .body("data.findAll { it.id == 11 }.last_name", hasItem("Edwards"))
                .body("data.findAll { it.id == 11 }.avatar", hasItem("https://reqres.in/img/faces/11-image.jpg"))
                /// ID 12
                .body("data.findAll { it.id == 12 }.email", hasItem("rachel.howell@reqres.in"))
                .body("data.findAll { it.id == 12 }.first_name", hasItem("Rachel")) 
                .body("data.findAll { it.id == 12 }.last_name", hasItem("Howell"))
                .body("data.findAll { it.id == 12 }.avatar", hasItem("https://reqres.in/img/faces/12-image.jpg"))
        ;
        }
}
