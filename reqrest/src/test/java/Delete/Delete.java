package Delete;

import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
///import static org.hamcrest.Matchers.*;

public class Delete {

    @Test
    public void testnameDelete() {
        given()

            .log().all()
            .contentType(ContentType.JSON)

        .when()
            .delete("https://reqres.in/api/users/2")
        .then()
            .statusCode(204);
    }
}
