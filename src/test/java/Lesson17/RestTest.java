package Lesson17;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsString;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class RestTest {

    private final String baseURI = "https://postman-echo.com";
    private final String body = "This is expected to be sent back as part of response body";

    @DisplayName("GET Request")
    @ParameterizedTest
    @CsvSource({"foo1, bar1, foo2, bar2"})
    public void testGetRequest(String param1, String value1, String param2, String value2) {
        given()
                .log().all()
                .baseUri(baseURI)
                .param(param1, value1)
                .param(param2, value2)
                .when()
                .get("/get")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("args." + param1, equalTo(value1))
                .body("args." + param2, equalTo(value2));
    }

    @DisplayName("POST Raw Text")
    @ParameterizedTest
    @ValueSource(strings = {"{\"test\": \"value\"\n}"})
    public void postRawText(String text) {
        Response response = given()
                .log().all()
                .baseUri(baseURI)
                .contentType(ContentType.TEXT)
                .body(text)
                .when()
                .post("/post");
        response
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .and()
                .body("data", containsString(text));
    }

    @DisplayName("POST Form Data")
    @ParameterizedTest
    @CsvSource({"foo1, bar1, foo2, bar2"})
    public void testPostMethod(String param1, String value1, String param2, String value2) {
        given()
                .log().all()
                .baseUri(baseURI)
                .contentType(ContentType.URLENC.withCharset("UTF-8"))
                .formParam(param1, value1)
                .formParam(param2, value2)
                .when()
                .post("/post")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body("form." + param1, equalTo(value1))
                .body("form." + param2, equalTo(value2));
    }

    @DisplayName("PUT Request")
    @ParameterizedTest
    @ValueSource(strings = {body})
    public void putRequest(String text) {
        given()
                .log().all()
                .baseUri(baseURI)
                .contentType(ContentType.TEXT)
                .body(text)
                .when()
                .put("/put")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .and()
                .body("data", equalTo(text));
    }

    @DisplayName("PATCH Request")
    @ParameterizedTest
    @ValueSource(strings = {body})
    public void patchRequest(String text) {
        given()
                .log().all()
                .baseUri(baseURI)
                .contentType(ContentType.TEXT)
                .body(text)
                .when()
                .patch("/patch")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .and()
                .body("data", equalTo(text));
    }

    @DisplayName("DELETE Request")
    @ParameterizedTest
    @ValueSource(strings = {body})
    public void deleteRequest(String text) {
        given()
                .log().all()
                .baseUri(baseURI)
                .contentType(ContentType.TEXT)
                .body(text)
                .when()
                .delete("/delete")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .and()
                .body("data", equalTo(text));
    }

}










