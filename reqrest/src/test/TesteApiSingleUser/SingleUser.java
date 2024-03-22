package TesteApiSingleUser;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SingleUser {

@Test
public void testname() {
        given()
            .when()
            .get("https://reqres.in/api/users/2")
            .then()
            .statusCode(200)
            .body("data.id", equalTo(2))
            .body("data.email", equalTo("janet.weaver@reqres.in"))
            .body("data.first_name", equalTo("Janet"))
            .body("data.last_name", equalTo("Weaver"))
            .body("data.avatar", equalTo("https://reqres.in/img/faces/2-image.jpg"));
    }
}
