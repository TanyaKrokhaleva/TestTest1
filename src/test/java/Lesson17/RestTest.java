package Lesson17;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.containsString;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class RestTest {
    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        given()
                .log().all()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void postRawText() {
        String baseUrl = "https://postman-echo.com";
        String requestBody = "{\n\"test\": \"value\"\n}";

        Response response = given()
                .baseUri(baseUrl)
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when()
                .post("/post");

        response.then().assertThat()
                .statusCode(200)
                .and()
                .body("data", containsString("\"test\": \"value\""));

        System.out.println(response.asString());
    }

    @Test
    public void putRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";

        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when()
                .put("https://postman-echo.com/put")
                .then()
                .assertThat().statusCode(200)
                .and()
                .body("data", equalTo(requestBody));
    }

    @Test
    public void patchRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";

        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when()
                .patch("https://postman-echo.com/patch")
                .then()
                .assertThat().statusCode(200)
                .and()
                .body("data", equalTo(requestBody));
    }

    @Test
    public void deleteRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";

        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when()
                .delete("https://postman-echo.com/delete")
                .then()
                .assertThat().statusCode(200)
                .and()
                .body("data", equalTo(requestBody));
    }
}











