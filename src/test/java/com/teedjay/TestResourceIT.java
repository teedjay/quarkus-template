package com.teedjay;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class TestResourceIT {

    @InjectMock
    TestData data;

    @Test
    public void testTheMock() {
        Mockito.when(data.getName()).thenReturn("this is a mock of TestData inside the TestResource");
        given()
            .when()
                .get("/test")
            .then()
                .statusCode(200)
                .body(is("this is a mock of TestData inside the TestResource"))
            ;
    }

    @Test
    public void testAnotherMock() {
        Mockito.when(data.getName()).thenReturn("this is not the same mock as previous test");
        given()
            .when()
            .get("/test")
            .then()
            .statusCode(200)
            .body(is("this is not the same mock as previous test"))
        ;
    }

}
