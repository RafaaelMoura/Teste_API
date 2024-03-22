package Post;
import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Creat {

    @Test
    public void testname() {
        
        String requestBody = "{\"name\": \"John\", \"job\": \"leader\"}";

        given()

            .log().all()
            .contentType(ContentType.JSON)
            .contentType("application/json") 
            .body(requestBody)
        .when()

            .post("https://reqres.in/api/users")
        .then()
            .log().all()
            .contentType(ContentType.JSON)
            .statusCode(201)
            
            .body("name", equalTo("John"))
            .body("job", equalTo("leader"))
            .body("id", notNullValue());
    }
}
