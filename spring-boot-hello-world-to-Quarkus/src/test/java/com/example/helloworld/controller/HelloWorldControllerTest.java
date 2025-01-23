package com.example.helloworld.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HelloWorldControllerTest {

    @Test
    public void testHelloWorldEndpoint() {
        given()
          .when().get("/api/v1/hello-world")
          .then()
             .statusCode(200)
             .body(is("Hello, World!"));
    }
    
    
}
