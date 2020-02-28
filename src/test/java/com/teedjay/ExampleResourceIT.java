package com.teedjay;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

@QuarkusTest
public class ExampleResourceIT {

    @Test
    public void testHelloText() {
        given()
          .when()
            .accept("text/plain")
            .get("/hello")
          .then()
             .statusCode(200)
             .body(is("hello\n"));
    }

    @Test
    public void testHelloHtml() {
        given()
            .when()
              .accept("text/html")
              .get("/hello")
            .then()
              .statusCode(200)
              .body(containsString("This template is automatically selected when asking for text/html and says <bold>hello html template</bold>."));
    }

    @Test
    public void testHelloXml() {
        given()
            .when()
              .accept("application/xml")
              .get("/hello")
            .then()
              .statusCode(200)
              .body("xml.message", equalTo("hello xml template"));
    }

}
